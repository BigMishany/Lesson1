package xyz.bgw.mikhail.lesson1;

public class Student {
private long id;
private String name;
private String surname;
private String garde;
private String bithdayYear;

    public String getBithdayYear() {
        return bithdayYear;
    }

    public String getGarde() {
        return garde;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setBithdayYear(String bithdayYear) {
        this.bithdayYear = bithdayYear;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId() {
        return String.valueOf(id);
    }
}

