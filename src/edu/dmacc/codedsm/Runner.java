package edu.dmacc.codedsm;

public class Runner {
    public static void main(String[] args) {

        KindergartenVolunteerList MrsHaineClass = new KindergartenVolunteerList();
        System.out.println("Mrs. Haines Class: ");

        Person whoIsWho = new Person("Mrs. Haines", "Renea", "Linda");
        System.out.println(whoIsWho);
        ReadToClass ReadToClassObject = new ReadToClass("The Sky is Falling", "Two", "Jack", "14 minutes", "Monday");
        System.out.println(ReadToClassObject);
        HolidayParties HolidayPartiesObject = new HolidayParties("pizza", "Orange Drink", "Red Rover", "Shelia");
        System.out.println(HolidayPartiesObject);
        StudentAction StudentActionObject = new StudentAction("Student Reads Aloud", "Sight Words", "Lilly", "10 minutes", "Monday");
        System.out.println(StudentActionObject);

    }


}


