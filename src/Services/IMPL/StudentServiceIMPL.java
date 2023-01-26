package Services.IMPL;

import DTO.Student;
import Repository.IMPL.StudentRepositoryIMPL;
import Repository.StudentRepository;
import Services.StudentService;

import java.util.List;

public class StudentServiceIMPL implements StudentService {
    @Override
    public List<Student> getAllStudents() {
        StudentRepository studentRepository = new StudentRepositoryIMPL();
        return studentRepository.getAllStudents();
    }

    @Override
    public List<Student> addNewStudent(String name, int age) {
        StudentRepository studentRepository = new StudentRepositoryIMPL();
        return studentRepository.addNewStudent(name, age);
    }


}
