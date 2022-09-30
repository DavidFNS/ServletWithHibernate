package servletProject.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import servletProject.dto.CarDto;
import servletProject.dto.ResponseDto;
import servletProject.entity.Car;
import servletProject.mapper.CarMapper;
import servletProject.repository.CarRepository;
import servletProject.service.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(){
        carRepository = CarRepository.getInstance();
    }
    @Override
    public void getAllCars() {
        carRepository.getAllCars();
    }

    @Override
    public void addNewCar(HttpServletRequest request, HttpServletResponse response) {
        byte[] body;
        try {
            body =  request.getInputStream().readAllBytes();

            ObjectMapper objectMapper = new ObjectMapper();
            CarDto carDto = objectMapper.readValue(body, CarDto.class);

            Car car = CarMapper.toEntity(carDto);
            carRepository.addCar(car);
            PrintWriter out = response.getWriter();
            out.println(new ResponseDto<CarDto>(200, "OK", true, carDto));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCar(HttpServletRequest request, HttpServletResponse response) {
        try {
            byte[] bytes = request.getInputStream().readAllBytes();

            ObjectMapper objectMapper = new ObjectMapper();
            CarDto car =  objectMapper.readValue(bytes, CarDto.class);
            carRepository.updateCar(CarMapper.toEntity(car));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCarById(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        carRepository.deleteCar(id);
    }
}
