package Repository.IMPL;

import DTO.StudentsSpecializations;
import Repository.StudentsSpecializationsRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentsSpecializationsRepositoryIMPL implements StudentsSpecializationsRepository {
    @Override
    public void addSpecializationBySpecializationID(UUID studentID, UUID specializationID) {
        try (FileWriter fileWriter = new FileWriter("resources/studentSpecialization.txt", true)) {

            StudentsSpecializations studentsSpecializations = new StudentsSpecializations(studentID, specializationID);
            String s = studentsSpecializations.getId() + "," + studentsSpecializations.getStudentID() + "," +
                    studentsSpecializations.getSpecializationsID();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<StudentsSpecializations> getStudentsSpecializationsToStudentByID(UUID studentID, UUID specializationID) {
        List<StudentsSpecializations> studentsSpecializationsArrayList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/studentSpecialization.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                StudentsSpecializations studentsSpecializations1 =
                        new StudentsSpecializations(UUID.fromString(s[0]), UUID.fromString(s[1]), UUID.fromString(s[2]));
                if (studentsSpecializations1.getStudentID().equals(studentID) &&
                        studentsSpecializations1.getSpecializationsID().equals(specializationID)) {
                    studentsSpecializationsArrayList.add(studentsSpecializations1);
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentsSpecializationsArrayList;
    }
}
