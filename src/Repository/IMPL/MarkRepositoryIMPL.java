package Repository.IMPL;

import DTO.Mark;
import Repository.GroupRepository;
import Repository.MarkRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MarkRepositoryIMPL implements MarkRepository {
    List<Mark> markList = new ArrayList<>();
    @Override
    public void addMArkBySpecializationID(UUID studentSpecializationID, UUID teacherID,int mark) {
        try (FileWriter fileWriter = new FileWriter("resources/marks.txt", true)) {

            Mark marks = new Mark(studentSpecializationID,teacherID,new Date(),mark);
            String s = marks.getId() + "," + marks.getSubjectStudentID() + "," +
                    marks.getTeacherID() + "," + marks.getDateOfMark()+ "," + marks.getMark();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Mark> getAllMarks() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/marks.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Mark mark = new Mark(UUID.fromString(s[0]),UUID.fromString(s[1]),UUID.fromString(s[2]),Date.from(Instant.parse(s[3])),Integer.parseInt(s[4]));
                GroupRepository groupRepository = new GroupRepositoryIMPL();
                markList.add(mark);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return markList;
    }

}
