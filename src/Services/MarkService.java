package Services;

import DTO.Mark;

import java.util.List;
import java.util.UUID;

public interface MarkService {
    void addMarkToStudentBySpecializationID(UUID studentSpecializationID,UUID teacherID,int mark);
    List<Mark> getAllMarks();
}
