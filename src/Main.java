import DTO.Student;
import Services.*;
import Services.IMPL.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        int inputNumber;

        do {
            System.out.println("""
                                    Enter a number from 0 to 9. If you enter the number :
                                    1 - print all students\s
                     -               11 - print information about student\s
                      -              12 - print all delete students\s
                                    2 - add new student\s
                     -               21 - add student to group\s
                                    22 - print all groups\s
                       -             3 - delete student\s
                                    4 - add phone to student\s
                    -                5 - find student by ID\s
                                    6 - add email to student\s
                                    7 - print all subjects\s
                                    71 - add subject to student\s
                                    8 - add new subject\s
                                    81 - add mark by subject to student\s
                                    82 - print all mark by subject by student\s
                                    9 - get to know subject by ID\s
                                    10 - print all faculty\s
                                    101 - add new faculty\s
                                    13 - add new teacher\s
                                    131 - print all teachers\s
                                    0 - exit from program""");

            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1 -> {
                    StudentService studentService = new StudentServiceIMPL();
                    System.out.println(studentService.getAllStudents());
                }
                case 11 -> {
                }
                case 12 -> {
                }
                case 2 -> {
                    System.out.print("Input name of student: ");
                    String firstName = scanner.next();
                    System.out.print("Input name of surname: ");
                    String secondName = scanner.next();
                    System.out.print("Input date of birthday of student in format dd/mm/yyyy: ");
                    int dateOfBirthday = scanner.nextInt();
                    System.out.print("Input id of group: ");
                    UUID groupID = UUID.fromString(scanner.next());
                    StudentService studentService = new StudentServiceIMPL();
                    studentService.addNewStudent(firstName, secondName, dateOfBirthday, groupID);
                    System.out.println(studentService.getAllStudents());
                }
                case 21 -> {

                }
                case 22 -> {
                    GroupService groupService = new GroupServiceIMPL();
                    System.out.println(groupService.getAllGroups());
                }
                case 3 -> {
                }
                case 4 -> {
                    System.out.println("Input ID of student :");
                    UUID studentID = UUID.fromString(scanner.next());
                    System.out.println("Input number phone : ");
                    String phone = scanner.next();
                    PhonesService phonesService = new PhoneServiceIMPL();
                    phonesService.addPhoneByStudentID(studentID, phone);
                }
                case 5 -> {

                }
                case 6 -> {
                    System.out.println("Input ID of student :");
                    UUID studentID = UUID.fromString(scanner.next());
                    System.out.println("Input email : ");
                    String email = scanner.next();
                    EmailService emailService = new EmailServiceIMPL();
                    emailService.addEmailByStudentID(studentID, email);
                }
                case 7 -> {
                    SubjectService subjectService = new SubjectServiceIMPL();
                    System.out.println(subjectService.getAllSubjects());
                }
                case 71 -> {
                    System.out.println("Input ID of student:");
                    UUID studentID = UUID.fromString(scanner.next());
                    System.out.println("Input ID of subject : ");
                    UUID specializationID = UUID.fromString(scanner.next());
                    StudentsSpecializationsService studentsSpecializations = new StudentsSpecializationsServiceIMPL();
                    studentsSpecializations.addSpecializationToStudentByStudentID(studentID, specializationID);
                }
                case 8 -> {
                    System.out.println("Input name of subject : ");
                    String nameSubject = scanner.next();
                    SubjectService subjectService = new SubjectServiceIMPL();
                    subjectService.addSubjectBySpecializationID(nameSubject);
                }
                case 81 -> {
                    System.out.print("Input student ID: ");
                    UUID studentSpecializationID = UUID.fromString(scanner.next());
                    System.out.print("Input teacher ID: ");
                    UUID teacherID = UUID.fromString(scanner.next());
                    System.out.print("Input date of mark: ");
                    String age = scanner.next();
                    Date dateOfBirthday = new SimpleDateFormat("dd/MM/yyyy").parse(age);
                    System.out.println("Date is : " + dateOfBirthday);
                    System.out.print("Input number of mark: ");
                    int mark = scanner.nextInt();
                    MarkService markService = new MarkServiceIMPL();
                    markService.addMarkToStudentBySpecializationID(studentSpecializationID, teacherID, mark);
                }
                case 82 -> {
                    MarkService markService = new MarkServiceIMPL();
                    System.out.println(markService.getAllMarks());
                }
                case 9 -> {

                }
                case 10 -> {
                    FacultyService facultyService = new FacultyServiceIMPL();
                    System.out.println(facultyService.getAllFaculties());
                }
                case 101 -> {
                    System.out.print("Input name of faculty: ");
                    String nameOfFaculty = scanner.next();
                    FacultyService facultyService = new FacultyServiceIMPL();
                    facultyService.addFaculty(nameOfFaculty);
                    System.out.println(facultyService.getAllFaculties());
                }
                case 102 -> {
                    System.out.println("Input ID of faculty :");
                    UUID facultyID = UUID.fromString(scanner.next());
                    System.out.println("Input number of Group : ");
                    int numberOfGroup = scanner.nextInt();
                    GroupService groupService = new GroupServiceIMPL();
                    groupService.addGroupByFacultyID(facultyID, numberOfGroup);
                }
                case 13 -> {
                    System.out.print("Input name of teacher: ");
                    String firstNameOfTeacher = scanner.next();
                    System.out.print("Input surname of teacher: ");
                    String secondNameOfTeacher = scanner.next();
                    System.out.print("Input subject id to teacher: ");
                    UUID subjectID = UUID.fromString(scanner.next());
                    TeacherService teacherService = new TeacherServiceIMPL();
                    teacherService.addNewTeacher(firstNameOfTeacher, secondNameOfTeacher, subjectID);
                }
                case 131 -> {
                    TeacherService teacherService = new TeacherServiceIMPL();
                    System.out.println(teacherService.getAllTeachers());
                }
                case 14 -> {
                    System.out.println("Input ID of faculty :");
                    UUID facultyID = UUID.fromString(scanner.next());
                    System.out.println("Input name of group : ");
                    int nameOfGroup = scanner.nextInt();
                    GroupService groupService = new GroupServiceIMPL();
                    groupService.addGroupByFacultyID(facultyID, nameOfGroup);
                }
                case 0 -> System.out.println("You entered a number " + inputNumber + ". PROGRAM EXIT");
                default -> System.out.println("Incorrect number.Inter number in the range  1-9 or 0 to EXIT");


            }
        }

        while (inputNumber != 0);
    }

}