
package MAIN;

import ENCAPSULATION.FINAL;
import java.util.Scanner;

public class TEST {
    static Scanner InputString = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        FINAL test = new FINAL();
        
        System.out.print("Enter test case number: ");
        int testCase = scanner.nextInt();
        scanner.nextLine();
   
            switch (testCase) {
                case 1 -> {
                    test = new FINAL("Elihu France", "Caalim", 17);
                    System.out.println("Test Case 1: Student under 18");
                    System.out.println(test.toString());
                    break;
                }
                case 2 -> {
                    test = new FINAL("Elihu France", "Caalim", 17);
                    test.increaseAge();
                    System.out.println("Test Case 2: Increase age of student1");
                    System.out.println(test.toString());
                    break;
                }
                case 3 -> {
                    test = new FINAL("Elihu France", "Caalim", 19);
                    System.out.println("Test Case 3: Student over 18");
                    System.out.println(test.toString());
                    break;
                }
                default -> {
                    System.out.println("Invalid test case number.");
                    break;
                }
            }
            scanner.close();
        }
}
    

