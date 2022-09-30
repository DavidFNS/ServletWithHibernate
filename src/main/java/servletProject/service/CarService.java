package servletProject.service;

import servletProject.dto.CarDto;
import servletProject.dto.ResponseDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface CarService {
    ResponseDto<List<CarDto>> getAllCars();
    void addNewCar(HttpServletRequest request, HttpServletResponse response);
    void updateCar(HttpServletRequest request, HttpServletResponse response);
    void deleteCarById(HttpServletRequest req, HttpServletResponse response);
}
