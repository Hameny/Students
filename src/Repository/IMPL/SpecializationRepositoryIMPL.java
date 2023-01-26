package Repository.IMPL;

import DTO.Specialization;
import Repository.SpecializationRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SpecializationRepositoryIMPL implements SpecializationRepository {
    List<Specialization> specializations = new ArrayList<>();

    @Override
    public void addSpecializationToStudentByStudentID(String nameSpecialization) {
        try (FileWriter fileWriter = new FileWriter("resources/specialization.txt", true)) {

            Specialization specialization = new Specialization(nameSpecialization);
            String s = specialization.getSpecializationID() + "," + specialization.getSpecialization();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Specialization> getSpecializationByStudentID(UUID specializationID) {
        List<Specialization> specializations = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/specialization.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Specialization specialization = new Specialization(UUID.fromString(s[0]), s[1]);
                if (specialization.getSpecializationID().equals(specializationID)) {
                    specializations.add(specialization);
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return specializations;
    }

    @Override
    public List<Specialization> getAllSpecializations() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/specialization.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Specialization specialization = new Specialization(UUID.fromString(s[0]), s[1]);
                specializations.add(specialization);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return specializations;
    }
}



