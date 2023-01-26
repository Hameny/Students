package Repository;

import DTO.Specialization;

import java.util.List;
import java.util.UUID;

public interface SpecializationRepository {
    void addSpecializationToStudentByStudentID(String nameSpecialization);

    List<Specialization> getSpecializationByStudentID(UUID fromString);

    List<Specialization> getAllSpecializations();
}
