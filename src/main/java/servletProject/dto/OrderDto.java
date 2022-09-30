package servletProject.dto;


public class OrderDto {
    private Integer id;
    private Integer person_id;
    private Integer car_id;
    private Integer model_id;
    private Double total_price;

    public OrderDto(Integer id, Integer person_id, Integer car_id, Integer model_id, Double total_price) {
        this.id = id;
        this.person_id = person_id;
        this.car_id = car_id;
        this.model_id = model_id;
        this.total_price = total_price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public Integer getCar() {
        return car_id;
    }

    public Integer getModel_id() {
        return model_id;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public void setCar(Integer car_id) {
        this.car_id = car_id;
    }

    public void setModel_id(Integer model_id) {
        this.model_id = model_id;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "{" +
                " id: " + id + ",\n" +
                " person_id: " +  + person_id + ",\n" +
                " Car_id: " + car_id + ",\n" +
                " model_id:" + model_id + ",\n" +
                " total_price: " + total_price + ",\n" +
                "}";
    }
}
