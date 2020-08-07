package core.model;

import core.exceptions.*;
import core.service.BasePersonAction;

public class BasePerson implements BasePersonAction {
    protected String name;
    protected String surname;
    protected String lastname;
    protected String nickname;
    protected String designation;
    protected String email;
    protected String gender;
    protected int age;

    public BasePerson(String name, String surname, String lastname, String nickname, String designation, String email, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.designation = designation;
        this.email = email;
        this.gender = gender;
        this.age = age;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void learn(String name, String surname, String lastname) {

    }

    @Override
    public void eat(String name, String surname, String lastname) {

    }

    @Override
    public void walk(String name, String surname, String lastname) {

    }

    @Override
    public void actionType(String name, String surname, String lastname) {

    }
}