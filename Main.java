import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    while(true)
    {
      Scanner inp = new Scanner(System.in);
      System.out.print("Angle (A) or radian (R) value? ");

      String input = inp.nextLine();
      
      // When user enters an angle input
      if(input.equals("A"))
      {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your angle value: ");
        int angleVal = a.nextInt();
        if(angleVal == 90)
        {
          System.out.println("Radian Value: (π/2)");
          System.out.println("(Cos, Sin): (0, 1)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 60)
        {
          System.out.println("Radian Value: (π/3)");
          System.out.println("(Cos, Sin): (1/2, √3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 45)
        {
          System.out.println("Radian Value: (π/4)");
          System.out.println("(Cos, Sin): (√2/2, √2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 30)
        {
          System.out.println("Radian Value: (π/6)");
          System.out.println("(Cos, Sin): (√3/2, 1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 0)
        {
          System.out.println("Radian Value: 0");
          System.out.println("(Cos, Sin): (1, 0)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 360)
        {
          System.out.println("Radian Value: (0/2π)");
          System.out.println("(Cos, Sin): (1, 0)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 330)
        {
          System.out.println("Radian Value: (11π/6)");
          System.out.println("(Cos, Sin): (√3/2, -1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 315)
        {
          System.out.println("Radian Value: (7π/4)");
          System.out.println("(Cos, Sin): (√2/2, -√2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 300)
        {
          System.out.println("Radian Value: (5π/3)");
          System.out.println("(Cos, Sin): (1/2, -√3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 270)
        {
          System.out.println("Radian Value: (3π/2)");
          System.out.println("(Cos, Sin): (0, -1)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 240)
        {
          System.out.println("Radian Value: (4π/3)");
          System.out.println("(Cos, Sin): (-1/2, -√3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 225)
        {
          System.out.println("Radian Value: (5π/4)");
          System.out.println("(Cos, Sin): (-√2/2, -√2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 210)
        {
          System.out.println("Radian Value: (7π/6)");
          System.out.println("(Cos, Sin): (-√3/2, -1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 180)
        {
          System.out.println("Radian Value: (π)");
          System.out.println("(Cos, Sin): (-1, 0)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 150)
        {
          System.out.println("Radian Value: (5π/6)");
          System.out.println("(Cos, Sin): (-√3/2, 1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 135)
        {
          System.out.println("Radian Value: (3π/4)");
          System.out.println("(Cos, Sin): (-√2/2, √2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(angleVal == 120)
        {
          System.out.println("Radian Value: (2π/3)");
          System.out.println("(Cos, Sin): (-1/2, √3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
      }

      // When user enters a radian input
      if(input.equals("R"))
      {
        
        System.out.println("Use 'pi' as pi!");
        Scanner b = new Scanner(System.in);
        System.out.print("Enter your radian value: ");
        String radianVal = b.nextLine();

        if(radianVal.equals("pi/2"))
        {
          System.out.println("Angle Value: (90°)");
          System.out.println("(Cos, Sin): (0, 1)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }

        if(radianVal.equals("pi/3"))
        {
          System.out.println("Angle Value: (60°)");
          System.out.println("(Cos, Sin): (1/2, √3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("pi/4"))
        {
          System.out.println("Angle Value: (45°)");
          System.out.println("(Cos, Sin): (√2/2, √2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("pi/6"))
        {
          System.out.println("Angle Value: (30°)");
          System.out.println("(Cos, Sin): (√3/2, 1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("2pi"))
        {
          System.out.println("Angle Value: (360°)");
          System.out.println("(Cos, Sin): (1, 0)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("11pi/6"))
        {
          System.out.println("Angle Value: (330°)");
          System.out.println("(Cos, Sin): (√3/2, -1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("7pi/4"))
        {
          System.out.println("Angle Value: (315°)");
          System.out.println("(Cos, Sin): (√2/2, -√2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("5pi/3"))
        {
          System.out.println("Angle Value: (300°)");
          System.out.println("(Cos, Sin): (1/2, -√3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("3pi/2"))
        {
          System.out.println("Angle Value: (270°)");
          System.out.println("(Cos, Sin): (0, -1)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("4pi/3"))
        {
          System.out.println("Angle Value: (240°)");
          System.out.println("(Cos, Sin): (-1/2, -√3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("5pi/4"))
        {
          System.out.println("Angle Value: (225°)");
          System.out.println("(Cos, Sin): (-√2/2, -√2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("7pi/6"))
        {
          System.out.println("Angle Value: (210°)");
          System.out.println("(Cos, Sin): (-√3/2, -1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("pi"))
        {
          System.out.println("Angle Value: (180°)");
          System.out.println("(Cos, Sin): (-1, 0)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("5pi/6"))
        {
          System.out.println("Angle Value: (150°)");
          System.out.println("(Cos, Sin): (-√3/2, 1/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("3pi/4"))
        {
          System.out.println("Angle Value: (135°)");
          System.out.println("(Cos, Sin): (-√2/2, √2/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
        if(radianVal.equals("2pi/3"))
        {
          System.out.println("Angle Value: (120°)");
          System.out.println("(Cos, Sin): (-1/2, √3/2)");
          Scanner c = new Scanner(System.in);
          System.out.print("Continue? (Y) or (N) ");
          String usIn = c.nextLine();
          if(usIn.equals("Y"))
          {
            continue;
          }
          if(usIn.equals("N"))
          {
            System.out.print("\033[H\033[2J");
          }
          else
          {
            System.out.println("Please enter Y or N!");
            continue;
          }
        }
      }
    }
  }
}