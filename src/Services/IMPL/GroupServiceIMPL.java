package Services.IMPL;

import DTO.Group;
import Repository.GroupRepository;
import Repository.IMPL.GroupRepositoryIMPL;
import Repository.IMPL.StudentRepositoryIMPL;
import Repository.StudentRepository;
import Services.GroupService;

import java.util.List;
import java.util.UUID;

public class GroupServiceIMPL implements GroupService {
    @Override
    public void addGroupByFacultyID(UUID facultyID, int numberOfGroup) {
        GroupRepository groupRepository = new GroupRepositoryIMPL();
        groupRepository.addGroupByFacultyID(facultyID, numberOfGroup);
    }

    @Override
    public List<Group> getAllGroups() {
        GroupRepository groupRepository = new GroupRepositoryIMPL();
        return groupRepository.getAllGroups();
    }

}
