package Services;

import DTO.Specialization;
import DTO.Student;

import java.util.List;
import java.util.UUID;

public interface SpecializationService {
    void addSpecializationBySpecializationID(String nameSpecialization);

    List<Specialization> getAllSpecializations();
}
