
package com.yjs3509.domain;

public class Student {
    private String name;
    private String surname;
    private String department;
    private String id;

    public Student(String name, String surname, String department, String id) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.id = id;
    }
    public Student(){
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String information = "Name : " + name + "\n"
                           + "Surname :" + surname + "\n"
                           + "Departman : " + department + "\n"
                           + "ID : " + id + "\n"; 
        
        
        return information;
        
    }   
}
