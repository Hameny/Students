package Services.IMPL;

import DTO.Student;
import Repository.IMPL.StudentRepositoryIMPL;
import Repository.StudentRepository;
import Services.StudentService;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StudentServiceIMPL implements StudentService {
    @Override
    public List<Student> getAllStudents() {
        StudentRepository studentRepository = new StudentRepositoryIMPL();
        return studentRepository.getAllStudents();
    }

    @Override
    public List<Student> addNewStudent(String firstName, String secondName, int dateOfBirthday, UUID groupID) {
        StudentRepository studentRepository = new StudentRepositoryIMPL();
        return studentRepository.addNewStudent(firstName,secondName, dateOfBirthday,groupID);
    }

    @Override
    public List<Student> deleteStudentByID(UUID id) {
        StudentRepository studentRepository = new StudentRepositoryIMPL();
        return studentRepository.deleteStudentByID(id);
    }


}
