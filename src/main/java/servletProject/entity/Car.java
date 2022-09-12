package servletProject.entity;

import servletProject.dto.ModelDto;

public class Car {
    private Integer id;
    private String name_car;
    private ModelDto model;
    private String color;
    private Double price;
    private Integer year;
    private Number number;
    private String country;

    public Car(Integer id, String name_car, ModelDto model, String color, Double price, Integer year, Number number, String country) {
        this.id = id;
        this.name_car = name_car;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.number = number;
        this.country = country;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public String getName_car() {
        return name_car;
    }

    public ModelDto getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public Number getNumber() {
        return number;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "{" +
                " id: " + id + ",\n" +
                " name_car: " + name_car + ",\n" +
                " model_id: " + model + ",\n" +
                " color:" + color + ",\n" +
                " price: " + price + ",\n" +
                " year: " + year + ",\n" +
                " number_id: " + number + ",\n" +
                " country: " + country + ",\n" +
                "}";
    }
}
