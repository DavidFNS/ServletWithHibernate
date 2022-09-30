package servletProject.entity;

public class Number {
    private Integer id;
    private Integer numberOfCar;
    private Double price;

    public Number(Integer id, Integer numberOfCar, Double price) {
        this.id = id;
        this.numberOfCar = numberOfCar;
        this.price = price;
    }

    public Number(){

    }

    public Double getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumberOfCar() {
        return numberOfCar;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumberOfCar(Integer numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                " id: " + id + ",\n" +
                " numberOfCar:" + numberOfCar + "\n" +
                "}";
    }
}
