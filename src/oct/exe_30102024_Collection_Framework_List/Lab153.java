package oct.exe_30102024_Collection_Framework_List;

import java.util.ArrayList;
import java.util.List;

public class Lab153 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"khushbu");
        Student s2 = new Student(2,"pooja");
        List<Student> mystudents = new ArrayList<>();

        System.out.println("1st way");
        mystudents.add(s1);
        mystudents.add(s2);
        System.out.println(mystudents);

        System.out.println("PrintDetails 2nd way");
        System.out.println(s1.PrintDetails());
        System.out.println(s2.PrintDetails());

    }
}
class Student
{
    String Name;
    Integer RollNo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getRollNo() {
        return RollNo;
    }

    public void setRollNo(Integer rollNo) {
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                '}';
    }



    public String PrintDetails() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                '}';


    }

    public Student(Integer rollNo, String name) {
        RollNo = rollNo;
        Name = name;


    }
}
