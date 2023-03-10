package Services;

import DTO.Group;

import java.util.List;
import java.util.UUID;

public interface GroupService {
    void addGroupByFacultyID(UUID facultyID, int numberOfGroup);
    List<Group> getAllGroups();
}
