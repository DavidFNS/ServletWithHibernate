package servletProject.dto;


public class OrderDto {
    private Integer id;
    private PersonDto person;
    private CarDto car;
    private ModelDto model;
    private Double total_price;

    public OrderDto(Integer id, PersonDto person, CarDto car, ModelDto model, Double total_price) {
        this.id = id;
        this.person = person;
        this.car = car;
        this.model = model;
        this.total_price = total_price;
    }

    public Integer getId() {
        return id;
    }

    public PersonDto getPerson() {
        return person;
    }

    public CarDto getCar() {
        return car;
    }

    public ModelDto getModel() {
        return model;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public void setCar(CarDto car) {
        this.car = car;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }
}
