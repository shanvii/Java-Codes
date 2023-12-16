/* Build a file search utility that searches for files with a specific extension (e.g., ".txt") within a specified directory. 
 * List the file names that match the criteria.
 */

import java.io.File;
import java.io.FilenameFilter;

public class FileExtensionSearch 
{
    public static void main(String[] args) 
    {
        //directory path to search for files.
        String directoryPath = "D:\\Code";
        //target file extension to search for
        String targetExtension = ".txt";

        //file object to represent the specified directory
        File directory = new File(directoryPath);

        //to check if the specified path exists and if it's a directory
        if (directory.exists() && directory.isDirectory()) 
        {
            // list of files in the directory to apply filter and find files with the target extension.
            File[] matchingFiles = directory.listFiles(new FilenameFilter() 
            {
                @Override
                public boolean accept(File dir, String name) 
                {
                    //files name that end with the given extension
                    return name.endsWith(targetExtension);
                }
            });

            //to check if matching files were found
            if (matchingFiles != null) 
            {
                System.out.println("Matching files with extension " + targetExtension + ":");
                //printing the names of matching files
                for (File file : matchingFiles) 
                {
                    System.out.println(file.getName());
                }
            } 
            else 
                System.out.println("No matching files found.");
        } 
        else 
            System.out.println("The specified directory does not exist or is not a directory.");
    }
}
