package Services;

import DTO.Subject;

import java.util.List;

public interface SubjectService {
    void addSubjectBySpecializationID(String nameSubject);
    List<Subject> getAllSubjects();
}
