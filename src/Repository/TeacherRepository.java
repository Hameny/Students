package Repository;

import DTO.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherRepository {
    List<Teacher> addNewTeacher(String firstName, String secondName, UUID subjectID);
    List<Teacher> getAllTeachers();
}
