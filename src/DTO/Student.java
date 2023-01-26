package DTO;

import java.util.List;
import java.util.UUID;

public class Student {

    private UUID id;
    private String name;
    private int age;

    private List<Phone> phones;
    private List<Email> emails;
//    private List<Specialization> specializations;

    public Student(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

//    public List<Specialization> getSpecializations() {
//        return specializations;
//    }
//
//    public void setSpecializations(List<Specialization> specializations) {
//        this.specializations = specializations;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phones=" + phones +
                ", emails=" + emails +
//                ", specializations=" + specializations +
                '}'+'\n';
    }
}
