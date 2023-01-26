package Services;

import java.util.UUID;

public interface StudentsSpecializationsService {
    void addSpecializationToStudentByStudentID(UUID studentID,UUID specializationID);
}
