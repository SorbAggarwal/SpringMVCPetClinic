package com.springrest.learning.models;

public class Employee {

    private String Id;
    private String Name;
    private String Contact;

    public Employee(String id, String name, String contact) {
        Id = id;
        Name = name;
        Contact = contact;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
