package Bookstore;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            Solution[] book = new Solution[n];
            if (n==0){
                System.out.println("N/A");
            }else{
                scan.nextLine().trim();
                for (int i = 0; i < n ; i=i+1) {
                    String Bookname = scan.nextLine().trim();
                    String Authorname = scan.nextLine().trim();
                     String Isbn = scan.nextLine().trim();
                    book[i] = new Solution(Bookname,Authorname,Isbn);
                }
                for (int i = 0; i <book.length ; i++) {
                    System.out.println(book[i]);

                }
                scan.close();

            }
        }
    }
