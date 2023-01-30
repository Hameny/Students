package Services;

import DTO.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherService {
    List<Teacher> addNewTeacher(String firstName, String secondName, UUID subjectID);
    List<Teacher> getAllTeachers();
}
