/* Pradeep is designing the input Interaction for X-O game (aka TIC TAC-TOE). The user identifies the positions as 1|2|3|4|5|6|7|8|9. Since the board is a 2-dimensional Layout (3x3), Pradeep uses a 2-dimensional array to store board status and he identifies positions by row, and column as for first-row elements -(0,0)(0,1).(0,2) and for second-row elements -(1,0) (1,1) (1,2) and for 3rd row elements. (2,0) (2,1) (2,2) Help Pradeep to solve the conversion from user's input (1-9) to (Row, Column) (0-2),(0-2) respectively.

Note-Indexing for rows and columns is 0-based

Input Format
Only line of input will contain one integer n

Constraints
1 <= n <= 9


Output Format
By using the input, you have to tell the row and column number associated with it

Sample Input 0 */

import java.util.Scanner;

public class TicTacToeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input
        int userInput = scanner.nextInt();

        // Convert user input to (Row, Column) indices
        int row = (userInput - 1) / 3; // Row index
        int col = (userInput - 1) % 3; // Column index

        // Output the corresponding (Row, Column) indices
        System.out.println(row + " " + col);

        scanner.close();
    }
}
