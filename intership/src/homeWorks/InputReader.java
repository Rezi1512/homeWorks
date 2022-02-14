package homeWorks;

import java.util.Scanner;

public class InputReader {


    public static void saveEmployee(Emplyee emplyee){
        saveIdDoc(emplyee.getIdDoc());
        saveContact(emplyee.getContact());
        saveAddress(emplyee.getAdress());
        saveExperience(emplyee.getExperience());
        saveEducation(emplyee.getEducation());
    }

    public static void saveIdDoc( IdDoc idDoc){

        System.out.println("Jepni te dhenat e ID se punonjesit: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni emrin: ");
        idDoc.setName(input.nextLine());
        System.out.println("Jepni mbiemrin: ");
        idDoc.setLastname(input.nextLine());
        System.out.println("Jepni vendlindjen: ");
        idDoc.setPlaceOfBirth(input.nextLine());
        System.out.println("Jepni numrin personal: ");
        idDoc.setPersonalNumber(input.nextLine());
        System.out.println("Jepni daten e lindjes: ");
        idDoc.setDateOfBirth(input.nextLine());
        System.out.println();

    }


    public static void saveContact(Contact contact){
        System.out.println("Jepni emailin e punonjesit: ");
        Scanner input = new Scanner(System.in);
        contact.setEmail(input.nextLine());
        System.out.println("Jepni numrin e telefonit te punonjesit: ");
        contact.setPhoneNumber(input.nextLine());
        System.out.println("Jepni emrin e profilit ne LinkedIn te punonjeit: ");
        contact.setLinkedInName(input.nextLine());
        System.out.println();
    }


    public static void saveEducation(Education education){
        System.out.println("Jepni emrin e gjimnazit: ");
        Scanner input = new Scanner(System.in);
        education.getHighSchool().setName(input.nextLine());
        System.out.println("Jepni kohezgjatjen e gjimnazit: ");
        education.getHighSchool().setDuration(input.nextLine());
        System.out.println("A eshte diplomuar punonjesi ne gjimnaz? ");
        education.getHighSchool().setGraduate(input.nextBoolean());
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Jepni emrin e universitetit: ");
        education.getUniversity().setName(in.nextLine());
        System.out.println("Jepni kohezgjatjen e Universitetit: ");
        education.getUniversity().setDuration(in.nextLine());
        System.out.println("A eshte diplomuar punonjesi ne Universitet? ");
        education.getUniversity().setGraduate(in.nextBoolean());
        System.out.println();

    }

    public static void saveExperience(Experience experience){
       // System.out.println("Jepni numrin e eksperiencave: ");
        Scanner input = new Scanner(System.in);
        //experience.setExperienceCounter(input.nextInt());
        System.out.println("Jepni emrin e kompanise: ");
        experience.getPreviousJobs().setCompanyName(input.nextLine());
        System.out.println("Jepni pozicionin e punes");
        experience.getPreviousJobs().setJobPosition(input.nextLine());
        System.out.println("Pershkruajeni pozicionin tuat te punes: ");
        experience.getPreviousJobs().setJobDescription(input.nextLine());
        System.out.println("Jepni daten e fillimit te punes: ");
        experience.getPreviousJobs().setStartDate(input.nextLine());
        System.out.println("Jepni daten e lenies se punes: ");
        experience.getPreviousJobs().setEdnDate(input.nextLine());
        System.out.println();
    }


    public static void saveAddress(Address address){
        System.out.println("Jepni qytetin e punonjesit: ");
        Scanner input= new Scanner(System.in);
        address.setCity(input.nextLine());
        System.out.println("Jepni rrugen: ");
        address.setStreet(input.nextLine());
        System.out.println("Jepni numrin e nderteses: ");
        address.setBuildingNumber(input.nextInt());
    }








}
