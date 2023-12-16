/* Create a program that reads a text file and searches for a specific word or phrase within it. Report the number of occurrences in the file.
 */

//Scanner class imported
import java.util.Scanner;

public class FileSearchWord 
{
    public static void main(String[] args) throws Exception 
    {
        //object that represents text file to search in
        java.io.File file = new java.io.File("D:\\Code\\File.txt");

        //Scanner object to read the content of the file
        Scanner input = new Scanner(file);
        //to read user input
        Scanner sc = new Scanner(System.in);
        //to count the occurence
        int count = 0;


        //taking user input
        System.out.print("Enter word/phrase to be searched: ");
        String search = sc.nextLine();

        //checking each word in every line for the search word/phrase
        while (input.hasNext()) 
        {
            String word = input.next();
            if (word.equals(search))
                count++; //and incrementing count when found
        }

        //printing output according to the value of count
        if (count > 0)
            System.out.println(search + " occurs in the file, " + count + " number of times");

        else
            System.out.println("Does not occur!");

        //scanners closed
        input.close();
        sc.close();
    }
}
