package model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;
import java.util.Map;

public class Person {
    private String nameSuffix;
    private String firstName;
    private String lastName;
    private List<String> drugs;
    private String email;
    private Address address;
    private Map<String, Person> parents;

    public Person() {

    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    @JsonSetter("name_suffix")
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getFirstName() {
        return firstName;
    }

    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<String> drugs) {
        this.drugs = drugs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, Person> getParents() {
        return parents;
    }

    public void setParents(Map<String, Person> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameSuffix='" + nameSuffix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", drugs=" + drugs +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", parents=" + parents +
                '}';
    }
}
