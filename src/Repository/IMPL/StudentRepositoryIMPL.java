package Repository.IMPL;

import DTO.Email;
import DTO.Phone;
import DTO.Student;
import Repository.EmailRepository;
import Repository.PhoneRepository;
import Repository.StudentRepository;

import java.io.*;
import java.util.*;

public class StudentRepositoryIMPL implements StudentRepository {
    List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/students.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Student student1 = new Student(UUID.fromString(s[0]), s[1], Integer.parseInt(s[2]));
                PhoneRepository phoneRepository = new PhoneRepositoryIMPL();
                List<Phone> phones = phoneRepository.getPhoneByStudentID(UUID.fromString(s[0]));
                student1.setPhones(phones);
                EmailRepository emailRepository = new EmailRepositoryIMPL();
                List<Email> emails = emailRepository.getEmailByStudentID(UUID.fromString(s[0]));
                student1.setEmails(emails);
//                SpecializationRepository specializationRepository = new SpecializationRepositoryIMPL();
//                List<Specialization> specializations = specializationRepository.
//                        getSpecializationByStudentID(UUID.fromString(s[0]));
//                student1.setSpecializations(specializations);
                students.add(student1);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public List<Student> addNewStudent(String name, int age) {


        try (FileWriter fileWriter = new FileWriter("resources/students.txt", true)) {

            Student student = new Student(name, age);
            String s = student.getId().toString() + "," + student.getName() + "," + student.getAge();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
