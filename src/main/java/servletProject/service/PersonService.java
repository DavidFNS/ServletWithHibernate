package servletProject.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PersonService {
    void getAllPersons(HttpServletRequest request, HttpServletResponse response);
    void addNewPerson(HttpServletRequest request, HttpServletResponse response);
    void updatePerson(HttpServletRequest request, HttpServletResponse response);
    void deletePersonById(Integer id);
}
