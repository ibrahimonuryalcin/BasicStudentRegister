package com.yjs3509.main;

import com.yjs3509.domain.Student;
import com.yjs3509.domain.StudentOperation;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentOperation studentOperation = new StudentOperation();
        
        String studentoperations = "1 - Add Student\n"
                + "2 - Search Student\n"
                + "3 - Update Student\n"
                + "4 - Delete Student\n"
                + "5 - Show List\n"
                + "q - Quit";

        while (true) {
            System.out.println("------------OPERATIONS-----------");
            System.out.println(studentoperations);

            System.out.print("\nPlease Select An Operation : ");

            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Quit Program");
                break;
            } else if (operation.equals("1")) {

                System.out.print("Name : ");
                String name = scanner.nextLine();

                System.out.print("Surname : ");
                String surname = scanner.nextLine();

                System.out.print("Department : ");
                String department = scanner.nextLine();

                System.out.print("ID : ");
                String id = scanner.nextLine();

                studentOperation.addStudent(name, surname, department, id);
                
                System.out.println("\n****STUDENT SUCCESSFULLY ADDED***\n");
                
            } else if (operation.equals("2")){
                System.out.print("Please enter ID : ");
                String id = scanner.nextLine();
                
                Student resultSearch = studentOperation.searchStudent(id);
                
                System.out.println("\nSEARCH RESULT\n");
                System.out.println(resultSearch.toString());
            
            
            } else if(operation.equals("3")){
                System.out.println("The Student's id you want to update : ");
                
                String id = scanner.nextLine();
                
                System.out.println("Please Enter This Student's New Information");
                
                System.out.print("New Name : ");
                String newName = scanner.nextLine();
                
                System.out.print("New Surname : ");
                String newSurname = scanner.nextLine();
                
                System.out.print("New Department : ");
                String newDepartment = scanner.nextLine();
                
                System.out.print("New ID : ");
                String newId = scanner.nextLine();
                
                Student currentStudent = studentOperation.updateStudent(id,newName, newSurname, newDepartment, newId);
                System.out.println("\nREGISTRY UPDATED\n");
                System.out.println("\nCurrent Informations\n");
                System.out.println(currentStudent.toString());
                
            } else if(operation.equals("4")){
                System.out.print("The Student's id you want to delete : ");
                
                String id = scanner.nextLine();
                studentOperation.deleteStudent(id);
                
                System.out.println("\nREGISTRY DELETED\n");
     
            } else if (operation.equals("5")) {
                
                System.out.println("STUDENT LİST");
                studentOperation.showList();

            }
        }

    }
}
