package ua.cherkasskiy.hw10;

public class GetScholarship {
    public static void main(String[] args) {
        Student[] student = new Student[2];
        student[0] = new Student("Kaiser", "Sozu", "JavaOnline2", 3.9);
        student[1] = new Aspirant("Aleksii", "Cherkasskiy", "JavaOnline2", 5.0,
                "CourseWork");
        System.out.println(student[0].getScholarship());
        System.out.println(student[1].getScholarship());
    }

}