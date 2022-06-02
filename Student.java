public class Student {
    String name;
    int roll;
    String course;
    String grade;
    String email;
    String phone;

    public static void main(String[] args) {

        Student student1=new Student();
     student1.printInfo();

      Student student2=new Student();
      student2.printInfo2();

    }

    public void printInfo() {

        System.out.println(name = "My name is : " + "Noshin Rahman");
        System.out.println(roll = 12);
        System.out.println(course = "My course is:" + "QA");
        System.out.println(email = "My email is:" + "noshinln56@gmail.com");
        System.out.println(phone = "Phone number:" + "456-998-0987");
        System.out.println(grade = "My grade: " +'A');
    }

    public void printInfo2(){

        System.out.println(name= "Another student name is: "+ "Arif Aziz");
        System.out.println(roll= 21);
        System.out.println(course= "Student 2 course is: "+ "QA");
        System.out.println(email= "Student 2 email is:"+ "aziz098@gmail.com");
        System.out.println(phone= "Student 2 phone number is:"+ "876-098-7654");
        System.out.println(grade= "My grade:"+'B');


         }


}
