package Repository;

import DTO.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> getAllStudents();

    List<Student> addNewStudent(String name, int age);

}
