import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.next();
        String temp = str;

        String reverse = "";
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(temp.equals(reverse)){
            System.out.println( str + " is a palindrome");
        } else {
            System.out.println( str + " is not a palindrome");
        }
    }
}

