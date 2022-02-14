package homeWorks;

public class Contact {
    private String email;
    private String phoneNumber;
    private String linkedInName;


    public Contact(){}

    public Contact(String email, String phoneNumber, String linkedInName) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.linkedInName = linkedInName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLinkedInName(String linkedInName) {
        this.linkedInName = linkedInName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLinkedInName() {
        return linkedInName;
    }

    @Override
    public String toString() {
        return "\t {" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", linkedInName='" + linkedInName + '\'' +
                '}';
    }
}
