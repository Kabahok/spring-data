package com.egoravdeev.hibernate.model;

import com.egoravdeev.hibernate.embedded.PersonId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="persons")
public class Person {

    @EmbeddedId
    private PersonId personId;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="city_of_living")
    private String cityOfLiving;

    public Person() {

    }

    public Person(PersonId personId, String phoneNumber, String cityOfLiving) {
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public void setPersonId(PersonId personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}
