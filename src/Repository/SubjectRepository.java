package Repository;

import DTO.Subject;

import java.util.List;
import java.util.UUID;

public interface SubjectRepository {
    void addSubjectToStudentByStudentID(String nameSpecialization);

    List<Subject> getSubjectByStudentID(UUID fromString);

    List<Subject> getAllSubjects();
}
