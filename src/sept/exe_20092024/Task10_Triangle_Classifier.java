package sept.exe_20092024;

public class Task10_Triangle_Classifier {
    public static void main(String[] args) {
      int side1 = 10;
      int side2 = 20;
      int side3 = 10;
      if (side1 == side2 && side2 == side3)
      {
            System.out.println("This is an Equivalence triangle");
        }
      else if (side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("This is isosceles triangle");
        }
      else
        {
            System.out.println("This is scalene triangle");
        }
    }
}

//Triangle Classifier ( If)
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
//isosceles (exactly two sides are equal), or
//scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->