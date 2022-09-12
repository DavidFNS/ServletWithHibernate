package servletProject.dto;

public class CarDto {
    private Integer id;
    private String name_car;
    private Integer model_id;
    private String color;
    private Double price;
    private Integer year;
    private Integer number_id;
    private String country;

    public CarDto(Integer id, String name_car, Integer model_id, String color, Double price, Integer year, Integer number_id, String country) {
        this.id = id;
        this.name_car = name_car;
        this.model_id = model_id;
        this.color = color;
        this.price = price;
        this.year = year;
        this.number_id = number_id;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public String getName_car() {
        return name_car;
    }

    public Integer getModel_id() {
        return model_id;
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

    public String getCountry() {
        return country;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    public void setModel_id(Integer model_id) {
        this.model_id = model_id;
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

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" +
                " id: " + id + ",\n" +
                " name_car: " + name_car + ",\n" +
                " model_id: " + model_id + ",\n" +
                " color:" + color + ",\n" +
                " price: " + price + ",\n" +
                " year: " + year + ",\n" +
                " country: " + country + ",\n" +
                "}";
    }
}
