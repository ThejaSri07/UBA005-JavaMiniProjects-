package placement;
import java.util.Scanner;

public class StudentResult{ 
   public StudentResult() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the student name : ");
      String name = sc.nextLine();
      int[] marks = new int[3];
      float total = 0.0F;
      float Average = 0.0F;
      System.out.println("Enter the marks for 3 subjects (Out of 100)");

      for(int i = 0; i < 3; ++i) {
         System.out.print("Subject" + (i + 1) + "marks :");
         marks[i] = sc.nextInt();
         sc.nextLine();
         total += (float)marks[i];
      }

      Average = total / 3.0F;
      if (Average >= 90.0F) {
         System.out.println("S grade");
      } else if (Average >= 80.0F) {
         System.out.println("A grade");
      } else if (Average >= 70.0F) {
         System.out.println("B grade");
      } else if (Average >= 60.0F) {
         System.out.println("C grade");
      } else if (Average >= 50.0F) {
         System.out.println("D grade");
      } else {
         System.out.println("Fail");
      }

   }
}

