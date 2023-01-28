package Services.IMPL;

import DTO.Subject;
import Repository.IMPL.SubjectRepositoryIMPL;
import Repository.SubjectRepository;
import Services.SubjectService;

import java.util.List;

public class SubjectServiceIMPL implements SubjectService {
    @Override
    public void addSubjectBySpecializationID(String nameSpecialization) {
        SubjectRepository subjectRepository = new SubjectRepositoryIMPL();
        subjectRepository.addSubjectToStudentByStudentID(nameSpecialization);
    }

    @Override
    public List<Subject> getAllSubjects() {
        SubjectRepository subjectRepository = new SubjectRepositoryIMPL();
        return subjectRepository.getAllSubjects();
    }
}
