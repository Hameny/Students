package Repository.IMPL;

import DTO.Teacher;
import Repository.TeacherRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TeacherRepositoryIMPL implements TeacherRepository {
    List<Teacher> teacherArrayList = new ArrayList<>();

    @Override
    public List<Teacher> addNewTeacher(String firstName, String secondName, UUID subjectID) {
        try (FileWriter fileWriter = new FileWriter("resources/teachers.txt", true)) {

            Teacher teacher = new Teacher(firstName, secondName, subjectID);
            String s = teacher.getId().toString() + "," + teacher.getFirstNameOfTeacher() + "," + teacher.getSecondNameOfTeacher()
                    + "," + teacher.getSubjectID();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return teacherArrayList;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/teachers.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Teacher teacher = new Teacher(UUID.fromString(s[0]), s[1], s[2], UUID.fromString(s[4]));
                teacherArrayList.add(teacher);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacherArrayList;
    }
}
