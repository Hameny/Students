package Repository.IMPL;

import DTO.Subject;
import Repository.SubjectRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SubjectRepositoryIMPL implements SubjectRepository {
    List<Subject> subjectArrayList = new ArrayList<>();

    @Override
    public void addSubjectToStudentByStudentID(String nameSubject) {
        try (FileWriter fileWriter = new FileWriter("resources/subjects.txt", true)) {

            Subject subject = new Subject(nameSubject);
            String s = subject.getSubjectID() + "," + subject.getSubjectName();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Subject> getSubjectByStudentID(UUID subjectID) {
        List<Subject> subjects1 = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/subjects.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Subject subject = new Subject(UUID.fromString(s[0]), s[1]);
                if (subject.getSubjectID().equals(subjectID)) {
                    subjects1.add(subject);
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjects1;
    }

    @Override
    public List<Subject> getAllSubjects() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/subjects.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Subject subject = new Subject(UUID.fromString(s[0]), s[1]);
                subjectArrayList.add(subject);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjectArrayList;
    }
}



