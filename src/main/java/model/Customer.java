package model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Customer {
    private String name;
    private String surname;
    private Boolean sex;
    private List<Sentence> sentenceList;
    private UUID uuid;
    private LocalDate birthDay;

    public Customer(String name, String surname, Boolean sex, List<Sentence> sentenceList, LocalDate birthDay) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.sentenceList = sentenceList;
        this.uuid = UUID.randomUUID();
        this.birthDay = birthDay;
    }

    public Customer() {
        this.uuid = UUID.randomUUID();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Boolean getSex() {
        return sex;
    }
    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public List<Sentence> getSentenceList() {
        return sentenceList;
    }
    public void setSentenceList(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }
    public UUID getUuid() {
        return uuid;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (surname != null ? !surname.equals(customer.surname) : customer.surname != null) return false;
        if (sex != null ? !sex.equals(customer.sex) : customer.sex != null) return false;
        if (sentenceList != null ? !sentenceList.equals(customer.sentenceList) : customer.sentenceList != null)
            return false;
        if (uuid != null ? !uuid.equals(customer.uuid) : customer.uuid != null) return false;
        return birthDay != null ? birthDay.equals(customer.birthDay) : customer.birthDay == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (sentenceList != null ? sentenceList.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", sentenceList=" + sentenceList +
                ", uuid=" + uuid +
                ", birthDay=" + birthDay +
                '}';
    }
}
