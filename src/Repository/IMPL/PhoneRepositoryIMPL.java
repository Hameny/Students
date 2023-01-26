package Repository.IMPL;

import DTO.Phone;
import Repository.PhoneRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PhoneRepositoryIMPL implements PhoneRepository {
    @Override
    public void addPhoneByStudentID(UUID studentID, String phoneNumber) {

        try (FileWriter fileWriter = new FileWriter("resources/phones.txt", true)) {

            Phone phone = new Phone(phoneNumber, studentID);
            String s = phone.getId() + "," + phone.getNumberPhone() + "," + phone.getStudentID();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Phone> getPhoneByStudentID(UUID studentID) {
        List<Phone> phones = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/phones.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Phone phone1 = new Phone(UUID.fromString(s[0]), s[1], UUID.fromString(s[2]));
                if (phone1.getStudentID().equals(studentID)) {
                    phones.add(phone1);
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phones;
    }
}
