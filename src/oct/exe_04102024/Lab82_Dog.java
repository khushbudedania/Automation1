package oct.exe_04102024;

public class Lab82_Dog {

    String name;
    String breed;
    int legs;
    int age;

    Lab82_Dog()//default constractor
    {
        System.out.println("this is dc");

    }

    Lab82_Dog(String name)
    {
        System.out.println("this is pc");
        this.name = name;

    }

    Lab82_Dog(String name, String breed, int legs, int age)
    {
        System.out.println("this is pc");
        this.name = name;
        this.breed = breed;
        this.legs = legs;
        this.age = age;

    }

    public static void main(String[] args) {
        Lab82_Dog gs = new Lab82_Dog();

        Lab82_Dog bd = new Lab82_Dog("puppy");
        System.out.println(bd.name);

        Lab82_Dog bb = new Lab82_Dog("bb","gd",4,2);
        System.out.println(bb.name);
        System.out.println(bb.breed);
        System.out.println(bb.legs);
        System.out.println(bb.age);
    }
}

