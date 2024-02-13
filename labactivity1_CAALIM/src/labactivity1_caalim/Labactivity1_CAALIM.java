
package labactivity1_caalim;

import java.util.Scanner;

public class Labactivity1_CAALIM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Full Name:");
        String fullName = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Gender: ");
        String gen = scanner.nextLine();
        
        System.out.print("Address: ");
        String add = scanner.nextLine();
        
        System.out.print("Civil Status: ");
        String cS = scanner.nextLine();
        
        System.out.print("# of brothers/sisters: ");
        int siblings = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\n\nAge: " + fullName);
        System.out.println("Gender: " + gen);
        System.out.println("Address: " + add);
        System.out.println("Civil Status: " + cS);
        System.out.println("# of brothers/sisters: " + siblings);
        
        scanner.close();
    }
    
}
