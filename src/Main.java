import Services.*;
import Services.IMPL.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int inputNumber;


        do {
            System.out.println("""
                    Enter a number from 0 to 9. If you enter the number :
                    1 - print all students\s
                    2 - add one student and print all students
                    3 - add phone to student\s
                    4 - add email to student\s
                    5 - add specialization to student\s
                    6 - add new specialization\s
                    7 - print all specialization \s
                    0 - exit from program""");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1 -> {
                    StudentService studentService = new StudentServiceIMPL();
                    System.out.println(studentService.getAllStudents());

                }
                case 2 -> {
                    System.out.print("Input name of student: ");
                    String name = scanner.next();
                    System.out.print("Input age of student: ");
                    int age = scanner.nextInt();
                    StudentService studentService = new StudentServiceIMPL();
                    studentService.addNewStudent(name, age);
                    System.out.println(studentService.getAllStudents());

                }
                case 3 -> {
                    System.out.println("Input ID of student :");
                    UUID studentID = UUID.fromString(scanner.next());
                    System.out.println("Input number phone : ");
                    String phone = scanner.next();
                    PhonesService phonesService = new PhoneServiceIMPL();
                    phonesService.addPhoneByStudentID(studentID, phone);


                }
                case 4 -> {
                    System.out.println("Input ID of student :");
                    UUID studentID = UUID.fromString(scanner.next());
                    System.out.println("Input email : ");
                    String email = scanner.next();
                    EmailService emailService = new EmailServiceIMPL();
                    emailService.addEmailByStudentID(studentID, email);
                }
                case 5 -> {
                    System.out.println("Input ID of student to add specialization:");
                    UUID studentID = UUID.fromString(scanner.next());
                    System.out.println("Input ID of specialization : ");
                    UUID specializationID = UUID.fromString(scanner.next());
                    StudentsSpecializationsService studentsSpecializations = new StudentsSpecializationsServiceIMPL();
                    studentsSpecializations.addSpecializationToStudentByStudentID(studentID, specializationID);
                }
                case 6 -> {
                    System.out.println("Input name of specialization : ");
                    String nameSpecialization = scanner.next();
                    SpecializationService specializationService = new SpecializationServiceIMPL() {
                    };
                    specializationService.addSpecializationBySpecializationID(nameSpecialization);
                }
                case 7 -> {
                    SpecializationService specializationService = new SpecializationServiceIMPL();
                    System.out.println(specializationService.getAllSpecializations());
                }
//                case  8 -> {
//                    System.out.println("You entered a number" + inputNumber + ". Display first employee");
//                    System.out.println("Input name of employee who are you looking for : ");
//                    String nameSearch = scanner.next();
//                    if(employee.contains(nameSearch)){
//                        System.out.println("Name - " + nameSearch + " in list");
//                    }
//                    else{
//                        System.out.println("Name not found");
//                    }
//                    x = true;
//                }
//                case 9 -> {
//                    System.out.println("You entered a number" + inputNumber + ". Display list employee in string");
//                    System.out.println("Employee : " + employee);
//                    System.out.println("Employee " + String.join(",",employee));
//                    x = true;
//                }
                case 0 -> System.out.println("You entered a number " + inputNumber + ". PROGRAM EXIT");
                default -> System.out.println("Incorrect number.Inter number in the range  1-9 or 0 to EXIT");


            }
        }

        while (inputNumber != 0);
    }

}