package oct.exe_16102024_Static;

public class Lab103 {
    public static void main(String[] args) {

        Student s1 = new Student(22);
        Student s2 = new Student(23);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student. School_Name);
        Student. School_Name = "XYZ";
        System.out.println(Student. School_Name);

    }
}
class Student
{
    int age;//instance variable
    static String School_Name = "ABC";//static variable

    {
        System.out.println("IIB");//instance initalization block
        //it is created when the method is created.
        //here you can write a code that you want.
    }
    static
    {
        System.out.println("SIB");//static initalization block.
        //it ic loaded when the class is loadded.
        //it is loaded one time because class is loadded only one time.
        //first SIB is loaded because class is loaded first.
    }

    public Student(int age) {
        this.age = age;
    }
}
//static variable is loaded when the class is loaded.
//instance variable is loaded when the object is created(loaded).
//Student s1 = new Student(22);
// in here when student is loaded that time static variable school name is loaded.
//and they assign null value because string default value is null.
//instance variable age is loaded when the new student() object is created.
//Student->SIB->static variable->IIB->instance variable.
//In this example first student class is loaded then SIB then static variable then IIB then instance variable.
//Student->SIB->static variable------->this is created when the class is loaded.
//IIB->instance variable.-------->this is creted when the object is created.