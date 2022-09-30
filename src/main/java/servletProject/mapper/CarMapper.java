package servletProject.mapper;

import org.modelmapper.ModelMapper;
import servletProject.dto.CarDto;
import servletProject.entity.Car;

public class CarMapper {
    private static ModelMapper modelMapper = new ModelMapper();
    public static Car toEntity(CarDto carDto){
        return modelMapper.map(carDto, Car.class);
    }
    public static CarDto toDto(Car car){
        return modelMapper.map(car, CarDto.class);
    }
}
