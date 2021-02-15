import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Angle (A) or radian (R) value? ");

    String input = inp.nextLine();
    
    if(input.equals("A"))
    {
      Scanner a = new Scanner(System.in);
      System.out.print("Enter your angle value: ");
      int angleVal = a.nextInt();
      if(angleVal == 90)
      {
        System.out.println("Radian Value: (π/2)");
        System.out.println("Coordinate Value: (0, 1)");
      }
      if(angleVal == 60)
      {
        System.out.println("Radian Value: (π/3)");
        System.out.println("Coordinate Value: (1/2, √3/2)");
      }
      if(angleVal == 45)
      {
        System.out.println("Radian Value: (π/4)");
        System.out.println("Coordinate Value: (√2/2, √2/2)");
      }
      if(angleVal == 30)
      {
        System.out.println("Radian Value: (π/6)");
        System.out.println("Coordinate Value: (√3/2, 1/2)");
      }
      if(angleVal == 360)
      {
        System.out.println("Radian Value: (0/2π)");
        System.out.println("Coordinate Value: (1, 0)");
      }
      if(angleVal == 330)
      {
        System.out.println("Radian Value: (11π/6)");
        System.out.println("Coordinate Value: (√3/2, -1/2)");
      }
      if(angleVal == 315)
      {
        System.out.println("Radian Value: (7π/4)");
        System.out.println("Coordinate Value: (√2/2, -√2/2)");
      }
      if(angleVal == 300)
      {
        System.out.println("Radian Value: (5π/3)");
        System.out.println("Coordinate Value: (1/2, -√3/2)");
      }
      if(angleVal == 270)
      {
        System.out.println("Radian Value: (3π/2)");
        System.out.println("Coordinate Value: (0, -1)");
      }
      if(angleVal == 240)
      {
        System.out.println("Radian Value: (4π/3)");
        System.out.println("Coordinate Value: (-1/2, -√3/2)");
      }
      if(angleVal == 225)
      {
        System.out.println("Radian Value: (5π/4)");
        System.out.println("Coordinate Value: (-√2/2, -√2/2)");
      }
      if(angleVal == 210)
      {
        System.out.println("Radian Value: (7π/6)");
        System.out.println("Coordinate Value: (-√3/2, -1/2)");
      }
      if(angleVal == 180)
      {
        System.out.println("Radian Value: (π)");
        System.out.println("Coordinate Value: (-1, 0)");
      }
      if(angleVal == 150)
      {
        System.out.println("Radian Value: (5π/6)");
        System.out.println("Coordinate Value: (-√3/2, 1/2)");
      }
      if(angleVal == 135)
      {
        System.out.println("Radian Value: (3π/4)");
        System.out.println("Coordinate Value: (-√2/2, √2/2)");
      }
      if(angleVal == 120)
      {
        System.out.println("Radian Value: (2π/3)");
        System.out.println("Coordinate Value: (-1/2, √3/2)");
      }
    }

    if(input.equals("R"))
    {
      Scanner b = new Scanner(System.in);
      System.out.print("Enter your radian value: ");
      int radianVal = b.nextInt();
      System.out.print(radianVal);
    }
  }
}