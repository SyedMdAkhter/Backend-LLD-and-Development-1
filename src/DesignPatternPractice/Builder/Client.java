package DesignPatternPractice.Builder;

public class Client {
    public static void main(String[] args) {
        Student student1 =  Student.getbuilder().setName("Abhishek").setAge(26).setEmail("abhishek@gmail.com").build();
//        student1.setName("Abhishek");
//        student1.setAge(25);
//        student1.setEmail("abhishek@gmail.com");

        //Student student1 = new Student(studentBuilder);
        System.out.println(student1);

//        Student student2 = new Student.StudentBuilder().build();
//        student2.setName("Amit");
//        student2.setAge(26);
//        student2.setEmail("amit@gmail.com");
//        student2.setGender("male");
//        student2.setBatch_code("ashas_1");
//        student2.setPSP(78.90);
        Student student2 = Student.getbuilder().setName("Amit").setAge(26).setEmail("amit@gmail.com").setBatch_code("wehjej").setGender("male").build();

        //Student student2 = new Student(studentBuilder2);
        System.out.println(student2);

//        Student student3 = new Student.StudentBuilder().build();
//        student3.setPSP(67.90);
//        student3.setAge(27);
//        student3.setBatch_code("dsjsd_2");
//
//        //Student student3 = new Student(studentBuilder3);
//        System.out.println(student3);
//
//        Student student4 = new Student.StudentBuilder().build();
//        student4.setPSP(67.90);
//        student4.setAge(27);
//        student4.setBatch_code("dsjsd_3");
//
//        //Student student4 = new Student(studentBuilder4);
//        System.out.println(student4);

        //Student student5 = new Student(null);
        //Student student5 = new Student.StudentBuilder().build();
        //System.out.println(student5);



    }
}
