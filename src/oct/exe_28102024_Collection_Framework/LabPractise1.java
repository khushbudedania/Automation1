package oct.exe_28102024_Collection_Framework;

public class LabPractise1 {
    public static void main(String[] args) {
        //type1 type = new type1();
        LabPractise1 L1=  new LabPractise1();

    }


    interface car
    {
        String car = "Car name is :";

        void feature1();

        void price();
    }

    class type1 implements car {
        int cost1 = 1000000;

        public void feature1() {
            System.out.println(car + "Honda Amaze");

        }

        public void price() {
            System.out.println("Price is" + cost1);
        }

    }
}
//Sir, unable to create instance of the class that implements the interface in the main function.

//The reason you’re unable to create an instance of the class type1 in the main method
// is because the class type1 is an inner class in LabPractise1,
// and it’s not static. Non-static inner classes require an instance of the
// outer class (LabPractise1) to be created before they can be instantiated.

//To fix this issue, you have two options:
//Make the inner class type1 static so that it can be instantiated directly in the main method.
//Create an instance of LabPractise1 and then use it to create an instance of type1.