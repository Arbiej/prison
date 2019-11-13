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
}
