package Repository;

import DTO.Group;

import java.util.List;
import java.util.UUID;

public interface GroupRepository {
    void addGroupByFacultyID(UUID facultyID, int numberOfGroup);
    List<Group> getAllGroups();
}
