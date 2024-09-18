public class Student {
    public String name;
    public int studentID;
    public String major;
    public double GPA;

    public void displayInfo(){
        System.out.println("Student name: " + name );
        System.out.println("Student studentID: " + studentID );
        System.out.println("Student major: " + major );
        System.out.println("Student GPA: "+ GPA);

    }


    public Student(String name, int studentID, String major, double GPA){
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;


    }

}
