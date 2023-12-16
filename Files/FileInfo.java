/* Write a program that takes a file path as input and prints various information about the file, such as its size, last modified date, whether it's a directory or a file, and so on.
 */

//import for exception handling
import java.io.FileNotFoundException;

public class FileInfo 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //virtual object created in jvm
        java.io.File file = new java.io.File("D:\\Code\\File.txt");

        //to check if the file exists
        System.out.println(file.exists());

        //to check file size
        System.out.println("File size: " + file.length() + " bytes");
        //check last modified date of file
        System.out.println("Last modified date: " + new java.util.Date(file.lastModified()));
        //check if it is a firectory or a file
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());

    }
}
