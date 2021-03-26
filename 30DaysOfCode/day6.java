import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // to empty buffer after accepting an int 
        
        for(int i = 0; i < t; i++){ //to count input strings
            String s = scanner.nextLine(); // accept string
            for(int j = 0; j < s.length(); j++) {
                if(j % 2 == 0) { //even 
                    System.out.print(s.charAt(j)); // print even char 
                }
            }
            
            System.out.print(" "); // add space
                
            for(int j = 0; j < s.length(); j++) {
                if(j % 2 != 0) { //odd
                    System.out.print(s.charAt(j)); //print odd char
                }
            }
            System.out.println();    //go to next line and loop to get next String 
        }
        scanner.close();
    }
    
    
}
