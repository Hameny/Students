package Services.IMPL;

import DTO.Teacher;
import Repository.IMPL.TeacherRepositoryIMPL;
import Repository.TeacherRepository;
import Services.TeacherService;

import java.util.List;
import java.util.UUID;

public class TeacherServiceIMPL implements TeacherService {
    @Override
    public List<Teacher> addNewTeacher(String firstName, String secondName, UUID subjectID) {
        TeacherRepository teacherRepository = new TeacherRepositoryIMPL();
        return teacherRepository.addNewTeacher(firstName,secondName,subjectID);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        TeacherRepository teacherRepository = new TeacherRepositoryIMPL();
        return teacherRepository.getAllTeachers();
    }
}
