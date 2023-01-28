package Repository;

import DTO.StudentsSpecializations;

import java.util.List;
import java.util.UUID;

public interface StudentsSpecializationsRepository {
    void addSpecializationBySpecializationID(UUID studentID, UUID specializationID);
    List<StudentsSpecializations> getStudentsSpecializationsToStudentByID(UUID studentID,UUID specializationID);
}
