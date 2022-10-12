public class StudentList{
    public static Student[] list=new Student[10];
    public static int count=0;
    public static void addStudent(Student stud){
        if(count>=10){
            System.out.println("Student List full");
            return;
        }
        list[count]=stud;
        count++;
    }
    public static Student[] getStudentsWithAge(int age){
        Student[] s=new Student[10];
        int cnt=0;
        for(int i=0;i<count;i++){
            if(list[i].getAge()==age){
                s[cnt]=list[i];
                cnt++;
            }
        }
        if(cnt!=0){
            return s;
        }
        return null;
    }
    public static Student[] getStudentsWithLastName(String lastName){
        Student[] s=new Student[10];
        int cnt=0;
        for(int i=0;i<count;i++){
            if(list[i].getName().getLName().equals(lastName)){
                s[cnt]=list[i];
                cnt++;
            }
        }
        if(cnt!=0){
            return s;
        }
        return null;
    }
    public static Student[] getStudentsInRange(int minAge, int maxAge){
        Student[] s=new Student[10];
        int cnt=0;
        for(int i=0;i<count;i++){
            if(list[i].getAge()>=minAge && list[i].getAge()<=maxAge){
                s[cnt]=list[i];
                cnt++;
            }
        }
        if(cnt!=0){
            return s;
        }
        return null;
    }
}
