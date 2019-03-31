package edu.dmacc.codedsm;

public class Runner {
    public static void main(String[] args) {
        KindergartenVolunteerList MrsHaineClass = new KindergartenVolunteerList();
        System.out.println("Mrs. Haines Class: ");
        Person whoIsWho = new Person("Mrs. Haines", "Renea", "Linda");
        System.out.println(whoIsWho);
        ReadToClass ReadToClassObject = new ReadToClass("The Sky is Falling", "Two", "Jack", "14 minutes", "Monday" );
        System.out.println(ReadToClassObject);

    }




}


