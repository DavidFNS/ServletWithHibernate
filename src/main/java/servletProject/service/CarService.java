package servletProject.service;

import servletProject.dto.CarDto;
import servletProject.dto.ResponseDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CarService {
    void getAllCars();
    void addNewCar(HttpServletRequest request, HttpServletResponse response);
    void updateCar(HttpServletRequest request, HttpServletResponse response);
    void deleteCarById(HttpServletRequest req, HttpServletResponse response);
}
