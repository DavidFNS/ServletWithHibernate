package servletProject.mapper;

import org.modelmapper.ModelMapper;
import servletProject.dto.OrderDto;
import servletProject.dto.PersonDto;
import servletProject.entity.Order;
import servletProject.entity.Person;

public class PersonMapper {
    private static ModelMapper modelMapper = new ModelMapper();

    public static Person toEntity(PersonDto personDto){
        return modelMapper.map(personDto, Person.class);
    }

    public static PersonDto toDto(Person person){
        return modelMapper.map(person, PersonDto.class);
    }

}
