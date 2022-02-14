package homeWorks;

import java.util.Date;

public class IdDoc {
    private String name;
    private String lastname;
    private String placeOfBirth;
    private String personalNumber;
    private String dateOfBirth;




    public IdDoc(){}

    public IdDoc(String name, String lastname, String placeOfBirth, String personalNumber, String dateOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.placeOfBirth = placeOfBirth;
        this.personalNumber = personalNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "\t {" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
