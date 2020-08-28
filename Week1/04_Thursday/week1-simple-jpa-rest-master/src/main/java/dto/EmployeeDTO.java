package dto;

import entities.Employee;

public class EmployeeDTO {

    Long id;
    String name;
    String address;
    double salary;

    public EmployeeDTO(Employee e) {
        this.id = e.getId();
        this.name = e.getName();
        this.address = e.getAdress();
        this.salary = e.getSalary();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeDTO() {
    }
    
    
    
    
}
