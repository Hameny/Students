package Repository.IMPL;

import DTO.Group;
import Repository.GroupRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GroupRepositoryIMPL implements GroupRepository {
    List<Group> groupList = new ArrayList<>();
    @Override
    public void addGroupByFacultyID(UUID facultyID, int numberOfGroup) {
        try (FileWriter fileWriter = new FileWriter("resources/groups.txt", true)) {

            Group group = new Group(numberOfGroup, facultyID);
            String s = group.getId() + "," + group.getNumberOfGroup() + "," + group.getFacultyID();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Group> getAllGroups() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/groups.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Group group = new Group(UUID.fromString(s[0]),Integer.parseInt(s[1]), UUID.fromString(s[2]));
                GroupRepository groupRepository = new GroupRepositoryIMPL();
                groupList.add(group);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return groupList;
    }


//    @Override
//    public List<Group> getGroupByFacultyID(UUID facultyID) {
//        List<Group> groupArrayList = new ArrayList<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader("resources/groups.txt"))) {
//            String line = reader.readLine();
//            while (line != null) {
//                String[] s = line.split(",");
//                Group group = new Group(UUID.fromString(s[0]), Integer.parseInt(s[1]), UUID.fromString(s[2]),
//                        UUID.fromString(s[3]));
//                if (group.getFacultyID().equals(facultyID)) {
//                    groupArrayList.add(group);
//                }
//                line = reader.readLine();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return groupArrayList;
//    }
}
