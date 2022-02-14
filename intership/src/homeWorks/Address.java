package homeWorks;

public class Address {
    private String city;
    private String street;
    private int buildingNumber;


    public Address(){}

    public Address(String city, String road, int buildingNumber) {
        this.city = city;
        this.street = road;
        this.buildingNumber = buildingNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    @Override
    public String toString() {
        return "\t {" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber=" + buildingNumber +
                '}';
    }
}
