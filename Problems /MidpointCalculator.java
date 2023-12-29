/* Mani Arun, and kumar were very close friends at school. They were very good in Mathematics and were the pets of Ranjani Maam. Mani, Arun, and Kumar live in the same locality and their gang was known as 3- Psychos. A new student Logan joins their class and he wanted to be friends with the 3-Psychos. Logan asked Arun about his home address. Arun wanted to test Logan's mathematical skills and hence told that his house is at the midpoint of the line joining Mani's house and Kumar's house. Logan was puzzled. Can you help Logan out? Given the coordinates of the 2 endpoints of a line (x1,y1) and (x2y21). Write a program to find the midpoint of the line

Input Format
Input consists of 4 integers. The first and second value corresponds to x1 and y1 respectively. The third and fourth value correspond ta x2 and y2 respectively.

Contstraints:
NA

Output Format
Refer sample input and output for the exact formatting specifications.
print with 1 decimal place */

import java.util.Scanner;

public class MidpointCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates of the endpoints
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate midpoint coordinates
        double midpoint_x = (x1 + x2) / 2;
        double midpoint_y = (y1 + y2) / 2;

        // Print the midpoint with 1 decimal place
        System.out.printf("%.1f %.1f\n", midpoint_x, midpoint_y);

        scanner.close();
    }
}
