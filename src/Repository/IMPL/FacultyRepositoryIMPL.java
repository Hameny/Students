package Repository.IMPL;

import DTO.Facultet;
import Repository.FacultyRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FacultyRepositoryIMPL implements FacultyRepository {
    List<Facultet> facultetArrayList = new ArrayList<>();




    @Override
    public List<Facultet> getALLFaculty() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/faculty.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Facultet facultet = new Facultet(UUID.fromString(s[0]), s[1]);
                facultetArrayList.add(facultet);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facultetArrayList;
    }

    @Override
    public List<Facultet> addNewFaculty(String nameOfFacultet) {
        try (FileWriter fileWriter = new FileWriter("resources/faculty.txt", true)) {

            Facultet facultet = new Facultet(nameOfFacultet);
            String s = facultet.getId().toString() + "," + facultet.getNameOfFacultet();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return facultetArrayList;
    }
}
