package placement;
import java.util.Scanner;

public class HospitalManagementSystem {
   public HospitalManagementSystem() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] id = new int[100];
      String[] name = new String[100];
      String[] disease = new String[100];
      int count = 0;
      int choice = 0;

      while(choice != 5) {
         System.out.println("\nHospital Management System");
         System.out.println("1. Add Patient");
         System.out.println("2. View Patient");
         System.out.println("3. Search Patient");
         System.out.println("4. Delete Patient");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();
         sc.nextLine();
         if (choice >= 1 && choice <= 5) {
            switch (choice) {
               case 1:
                  System.out.print("How many patients do you want to add? ");
                  int n = sc.nextInt();
                  sc.nextLine();

                  for(int i = 0; i < n; ++i) {
                     System.out.println("\nEnter details for patient " + (i + 1));
                     System.out.print("Enter patient ID: ");
                     id[count] = sc.nextInt();
                     sc.nextLine();
                     System.out.print("Enter patient name: ");
                     name[count] = sc.nextLine();
                     System.out.print("Enter patient disease: ");
                     disease[count] = sc.nextLine();
                     ++count;
                  }

                  System.out.println("Patient details added successfully !!");
                  break;
               case 2:
                  if (count == 0) {
                     System.out.println("No patient details available !!");
                  } else {
                     System.out.print("Enter patient ID to view: ");
                     int viewId = sc.nextInt();
                     int found = 0;

                     for(int i = 0; i < count; ++i) {
                        if (id[i] == viewId) {
                           System.out.println("Patient ID : " + id[i]);
                           System.out.println("Patient Name : " + name[i]);
                           System.out.println("Patient Disease : " + disease[i]);
                           found = 1;
                           break;
                        }
                     }

                     if (found == 0) {
                        System.out.println("Patient not found !!");
                     }
                  }
                  break;
               case 3:
                  if (count == 0) {
                     System.out.println("No patient details available !!");
                  } else {
                     System.out.print("Enter patient ID to search: ");
                     int searchId = sc.nextInt();
                     int found = 0;

                     for(int i = 0; i < count; ++i) {
                        if (id[i] == searchId) {
                           System.out.println("Patient found !!");
                           System.out.println("Patient ID : " + id[i]);
                           System.out.println("Patient Name : " + name[i]);
                           System.out.println("Patient Disease : " + disease[i]);
                           found = 1;
                           break;
                        }
                     }

                     if (found == 0) {
                        System.out.println("Patient not found !!");
                     }
                  }
                  break;
               case 4:
                  if (count == 0) {
                     System.out.println("No patient details available !!");
                  } else {
                     System.out.print("Enter patient ID to delete: ");
                     int deleteId = sc.nextInt();
                     int found = 0;

                     for(int i = 0; i < count; ++i) {
                        if (id[i] == deleteId) {
                           for(int j = i; j < count - 1; ++j) {
                              id[j] = id[j + 1];
                              name[j] = name[j + 1];
                              disease[j] = disease[j + 1];
                           }

                           --count;
                           System.out.println("Patient deleted successfully !!");
                           found = 1;
                           break;
                        }
                     }

                     if (found == 0) {
                        System.out.println("Patient not found !!");
                     }
                  }
                  break;
               case 5:
                  System.out.println("Exiting program...");
            }
         } else {
            System.out.println("Enter the number correctly !!");
         }
      }

   }
}
