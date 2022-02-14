package homeWorks;

import java.util.Scanner;

public class Emplyee {
   private IdDoc idDoc = new IdDoc();
   private Contact contact = new Contact();
   private Education education = new Education();
   private Experience experience = new Experience();
   private Address adress = new Address();


    public Emplyee(){}

    public Emplyee(IdDoc idDoc, Contact contact, Education education, Experience experience, Address adress) {
        this.idDoc = idDoc;
        this.contact = contact;
        this.education = education;
        this.experience = experience;
        this.adress = adress;
    }


    public IdDoc getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(IdDoc idDoc) {
        this.idDoc = idDoc;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public Contact getContact() {
        return contact;
    }

    public Education getEducation() {
        return education;
    }

    public Experience getExperience() {
        return experience;
    }

    public Address getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------------------------------------"+
                "\n Emplyee: " +idDoc.getName() +" "+ idDoc.getLastname() +
                " \n 1. IdDoc \n" + idDoc.toString() +
                " \n \n 2. Contact \n" + contact.toString() +
                " \n \n 3. Education \n" + education.toString() +
                " \n \n 4. Experience \n" + experience.toString() +
                " \n \n 5. Adress \n" + adress.toString() +
                "\n-----------------------------------------------------------------\n";
    }

}
