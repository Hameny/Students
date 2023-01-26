package Services.IMPL;

import DTO.Specialization;
import Repository.IMPL.SpecializationRepositoryIMPL;
import Repository.SpecializationRepository;
import Services.SpecializationService;

import java.util.List;

public class SpecializationServiceIMPL implements SpecializationService {
    @Override
    public void addSpecializationBySpecializationID(String nameSpecialization) {
        SpecializationRepository specializationRepository = new SpecializationRepositoryIMPL();
        specializationRepository.addSpecializationToStudentByStudentID(nameSpecialization);
    }

    @Override
    public List<Specialization> getAllSpecializations() {
        SpecializationRepository specializationRepository = new SpecializationRepositoryIMPL();
        return specializationRepository.getAllSpecializations();
    }
}
