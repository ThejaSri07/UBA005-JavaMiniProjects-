package placement;
import java.util.ArrayList;

import java.util.Scanner;
@FunctionalInterface
interface online {
    void order(String item, int price);
}

public class FoodBilling {
   public FoodBilling() {
   }

   public static void main(String[] args) {
      int total = 0;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      String[] s = new String[]{"Dosa", "Idli", "Vada", "Upma"};
      int[] p = new int[]{100, 80, 60, 50};
      online o = (item, price) -> System.out.println("  " + item + "          Rs." + price);
      ArrayList<Integer> orderedItems = new ArrayList();
      System.out.println("=========== MENU ===========");

      for(int i = 0; i < s.length; ++i) {
         System.out.println("  " + (i + 1) + ". " + s[i] + "    Rs." + p[i]);
      }

      System.out.println("  5. Exit");
      System.out.println("============================");

      while(choice < 5) {
         System.out.println("Enter your choice:");
         choice = sc.nextInt();
         if (choice == 5) {
            break;
         }

         o.order(s[choice - 1], p[choice - 1]);
         total += p[choice - 1];
         orderedItems.add(choice);
      }

      double sgst = (double)total * (double)2.5F / (double)100.0F;
      double cgst = (double)total * (double)2.5F / (double)100.0F;
      double grandTotal = (double)total + sgst + cgst;
      System.out.println("========================================");
      System.out.println("        FOOD BILLING - INVOICE          ");
      System.out.println("========================================");
      System.out.println("  Item              Qty       Price");
      System.out.println("----------------------------------------");
      int[] qty = new int[s.length];

      for(int idx : orderedItems) {
         ++qty[idx - 1];
      }

      for(int i = 0; i < s.length; ++i) {
         if (qty[i] > 0) {
            System.out.printf("  %-18s %d      Rs.%d%n", s[i], qty[i], qty[i] * p[i]);
         }
      }

      System.out.println("----------------------------------------");
      System.out.printf("  Subtotal:                  Rs.%d%n", total);
      System.out.printf("  SGST (2.5%%):               Rs.%.2f%n", sgst);
      System.out.printf("  CGST (2.5%%):               Rs.%.2f%n", cgst);
      System.out.println("----------------------------------------");
      System.out.printf("  Grand Total:               Rs.%.2f%n", grandTotal);
      System.out.println("========================================");
      System.out.println("        Order Successful!");
      System.out.println("       Thank you, visit again!");
      System.out.println("========================================");
   }
}
