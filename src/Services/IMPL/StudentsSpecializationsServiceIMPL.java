package Services.IMPL;

import Repository.IMPL.StudentsSpecializationsRepositoryIMPL;
import Repository.StudentsSpecializationsRepository;
import Services.StudentsSpecializationsService;

import java.util.UUID;

public class StudentsSpecializationsServiceIMPL implements StudentsSpecializationsService {


    @Override
    public void addSpecializationToStudentByStudentID(UUID studentID, UUID specializationID) {
        StudentsSpecializationsRepository studentsSpecializationsRepository = new StudentsSpecializationsRepositoryIMPL();
        studentsSpecializationsRepository.addSpecializationBySpecializationID(studentID,specializationID);
    }
}

