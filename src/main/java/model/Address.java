package model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Address {
    private String country;
    private String city;
    private String street;
    private String houseNumber;

    public Address() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonSetter("house_number")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}