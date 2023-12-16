/* Write a Java program that counts and prints the number of lines in a text file (e.g., "file.txt"). Make sure to handle file exceptions.
 */

//Scanner class imported
import java.util.Scanner;

public class FileCountLine 
{
    public static void main(String[] args) throws Exception 
    {
        //object that represents text file to count lines in
        java.io.File file = new java.io.File("D:\\Code\\File.txt");

        //Scanner object to read the content of the file
        Scanner input = new Scanner(file);
        //to count the occurences 
        int count=0;

        System.out.println("\n");
        //hasNext() - seperated by line to count lines
        while (input.hasNext()) 
        {
            count++;

            //next() - seperated by space
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            //content of text file printed
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        //no of lines in the text file printed
        System.out.println("\nNumber of lines: " + count);

        input.close();
    }
}
