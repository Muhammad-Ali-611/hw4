package Encapsulation;

public class TrainingInformation {
    public static void main(String[] args) {

        Training st1 = new Training();
        st1.setStID("199");
        st1.setStName("Hammad");
        st1.setStGrade("A+");
        st1.setStDOB("09-01-1998");


        Training st2 = new Training();
        st2.setStDOB("09-02-1999");
        st2.setStGrade("B+");
        st2.setStID("10");
        st2.setStName("ALI");

        System.out.println(st1.getStId()+" "+st1.getStDOB()+" "+ st1.getStGrade());
        System.out.println(st1.getStDOB()+" "+st1.getStName()+" "+st1.getStGrade());
    }

}
