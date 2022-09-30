package servletProject.entity;

public class Model {
    private Integer id;
    private String name_model;

    public Model(Integer id, String name_model) {
        this.id = id;
        this.name_model = name_model;
    }

    public Model(){}

    public Integer getId() {
        return id;
    }

    public String getName_model() {
        return name_model;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName_model(String name_model) {
        this.name_model = name_model;
    }

    @Override
    public String toString() {
        return "{" +
                " id: " + id + ",\n" +
                " name_model:" + name_model + "\n" +
                "}";
    }
}
