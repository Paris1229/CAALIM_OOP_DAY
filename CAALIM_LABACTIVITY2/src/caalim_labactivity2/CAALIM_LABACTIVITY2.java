
package caalim_labactivity2;

import java.util.Scanner;

public class CAALIM_LABACTIVITY2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();
        MisplacedCap(message);
    }
    private static void MisplacedCap(String message){
        int caps = 0;
        for (int i = 1; message.length() > i; i++){
            if (message.charAt(i - 1) >= 'a' && message.charAt(i - 1) <= 'z' && message.charAt(i) >= 'A' && message.charAt (i) <= 'Z'){
                caps = 1;
                break;
            }
        }
        if (caps == 1){
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
    
}
