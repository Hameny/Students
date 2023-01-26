package Services;

import DTO.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    List<Student> addNewStudent(String name, int age);

}
