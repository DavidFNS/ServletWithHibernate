package servletProject.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import servletProject.dto.ResponseDto;
import servletProject.entity.Person;
import servletProject.repository.PersonRepository;
import servletProject.service.PersonService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository = new PersonRepository();
    @Override
    public void getAllPersons(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> map = new HashMap<>();
        Enumeration<String> keys = request.getParameterNames();

        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            map.put(key, request.getParameter(key));
        }
        List<Person> personList = personRepository.getAllPersonByParams(map);

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        out.println(personList);
    }

    public void addOrUpdatePerson(HttpServletRequest request, HttpServletResponse response){
        try {
            byte [] body = request.getInputStream().readAllBytes();
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(body, Person.class);

            ResponseDto<Person> responseDto;
            if (person.getId() == null){
                personRepository.addPerson(person);
                responseDto = new ResponseDto<>(200, "Successfully added", true, person);
            }else {
                personRepository.updatePerson(person);
                responseDto = new ResponseDto<>(200, "Successfully updated", true, person);
            }
            PrintWriter out = response.getWriter();
            out.println(responseDto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void addNewPerson(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getMethod());
        try {
            byte [] body = request.getInputStream().readAllBytes();
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(body, Person.class);
            personRepository.addPerson(person);

            PrintWriter out = response.getWriter();
            out.println(new ResponseDto<Person>(200, "Successfully added", true, person));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePerson(HttpServletRequest request, HttpServletResponse response) {
        try {
            byte [] body = request.getInputStream().readAllBytes();
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(body, Person.class);
            personRepository.updatePerson(person);

            PrintWriter out = response.getWriter();
            out.println(new ResponseDto<Person>(200, "Successfully updated", true, person));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePersonById(Integer id) {

    }
}
