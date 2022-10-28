import java.util.Scanner;
class Test{
    public static Student readStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and age");
        String fullname=sc.next();
        Name name=new Name(fullname);
        int age=sc.nextInt();
        Student s=new Student(name,age);
        return s;
    }
    private static void printStudentList(Student[] s){
        for(int i=0;s[i]!=null;i++){
            System.out.println(s[i].toString());
        }
    }
    public static void main(String args[]){
        int n=3; // Number of students
        for(int i=0;i<n;i++){
            StudentList.addStudent(readStudent());
        }
        System.out.println("Students with age 20 are:");
        Student[] s1=StudentList.getStudentsWithAge(20);
        printStudentList(s1);
        System.out.println("Students with last name \"Sharma\" are:");
        Student[] s2=StudentList.getStudentsWithLastName("Sharma");
        printStudentList(s2);
        System.out.println("Students with age between 16 and 20 are:");
        Student[] s3=StudentList.getStudentsInRange(16,20);
        printStudentList(s3);
    }
}