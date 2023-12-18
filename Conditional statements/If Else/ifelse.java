import java.util.*;

public class ifelse 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int score = reader.nextInt();
        reader.close();

        // int score = 90;
        String grade;

        if(score>=90)
            grade = "A";
        else if(score>=80)
            grade = "B";
        else if(score>=70)
            grade = "C";
        else
            grade = "Fail";


        System.out.println("Grade is: " + grade);
    }

}
