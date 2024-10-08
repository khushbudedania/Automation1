package oct.exe_02102024;

public class ATBStudent {
    long phone;
    String name;
    String email;
    int age;
    int batch;
    boolean isMale;
    String address;
    boolean isfeespaid;
    String sid;
    String githublink;

    void study(){} //non returning no argument function
    void sleep(){}
    void walk(){}
    void learning(){}

    public static void main(String[] args) {
        ATBStudent object1=new ATBStudent();
        object1.age=27;
        //object1.study();

        System.out.println("object1 age is" +'\t'+ object1.age);

        ATBStudent object2=new ATBStudent();
        object2.name="Sonam";

        System.out.println("object2 age is" +'\t'+ object2.name);

        ATBStudent object3=new ATBStudent();
        object3.phone=965048376L;

        System.out.println("object3 age is" +'\t'+ object3.phone);

        ATBStudent object4=new ATBStudent();
        object4.batch=8;


        System.out.println("object4 age is" +'\t'+ object4.batch);

        ATBStudent object5=new ATBStudent();
        object5.address="Jasola";

        System.out.println("object5 age is" +'\t'+ object5.address);
    }
}


//Create a Class  ATBStudent and 5 Objects