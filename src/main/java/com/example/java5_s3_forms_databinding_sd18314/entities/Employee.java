package com.example.java5_s3_forms_databinding_sd18314.entities;

public class Employee {

    private Long id;
    private String name;
    private String contactNumber;
    private String office;

    public Employee() {}

    public Employee(Long id, String name, String contactNumber, String office) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.office = office;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
