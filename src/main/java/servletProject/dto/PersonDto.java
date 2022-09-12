package servletProject.dto;

import java.sql.Date;

public class PersonDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private Double account;
    private Date created_at;

    public PersonDto(Integer id, String firstname, String lastname, String email, String password, String phoneNumber, Double account, Date created_at) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.account = account;
        this.created_at = created_at;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getAccount() {
        return account;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "{" +
                " id: " + id + ",\n" +
                " firstname: " + firstname + ",\n" +
                " lastname: " + lastname + ",\n" +
                " email:" + email + ",\n" +
                " password: " + password + ",\n" +
                " phoneNumber: " + phoneNumber + ",\n" +
                " account: " + account + ",\n" +
                " created_at: " + created_at + "\n" +
                "}";
    }
}
