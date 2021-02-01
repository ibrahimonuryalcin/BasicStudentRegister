
package com.yjs3509.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class StudentOperation {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> school = new ArrayList<Student>();

    public void addStudent(String name, String surname, String department, String id){
        Student student = new Student();

        student.setName(name);
        student.setSurname(surname);
        student.setDepartment(department);
        student.setId(id);
        
        school.add(student);
        
        
    }
    public Student searchStudent(String id){
        Student student = null;
        Iterator<Student> iterator = school.iterator();
        while (iterator.hasNext()) {
            Student resultSearch = iterator.next();
            if(resultSearch.getId().equals(id)){
               student = resultSearch;
               break;
            }  
        }
        return student;
    }
    public Student updateStudent(String id, String newName, String newSurname, String newDepartment, String newId){
        
        Student student = searchStudent(id);
        if(student != null){
           student.setName(newName);
           student.setSurname(newSurname);
           student.setDepartment(newDepartment);
           student.setId(newId);     
       }        
         return student;
        
    }

    public void deleteStudent(String id){
         
          Student student = searchStudent(id);
          
          if(student != null){
              school.remove(student);
          }
    }

    public void showList(){
        
            if(school.isEmpty()){
                System.out.println("Nobody has registered yet");
            } else {
                Iterator<Student> iterator = school.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().toString());  
                }
            }
          
    }         
}
