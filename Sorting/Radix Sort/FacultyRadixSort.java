/*23MCA10122 
Satakshi Shanvi
Write a program to implement Radix Sort on 1D array of Faculty structure (contains 
faculty_name, faculty_ID, subject_codes, class_names), with key as faculty_ID. 
And count the number of swaps performed.
*/

class Faculty 
{
    int faculty_ID;
    String faculty_name;
    int[] subject_codes;
    String[] class_names;

    public Faculty(int faculty_ID, String faculty_name, int[] subject_codes, String[] class_names) 
    {
        this.faculty_ID = faculty_ID;
        this.faculty_name = faculty_name;
        this.subject_codes = subject_codes;
        this.class_names = class_names;
    }
}

public class FacultyRadixSort 
{
    public static void radixSort(Faculty[] arr) 
    {
        int maxFacultyID = getMaxFacultyID(arr);

        int exp = 1;
        int swapCount = 0;

        while (maxFacultyID / exp > 0) 
        {
            swapCount += countingSort(arr, exp);
            exp *= 10;
        }

        System.out.println("\nNumber of swaps performed: " + swapCount);
    }

    private static int getMaxFacultyID(Faculty[] arr) 
    {
        int maxFacultyID = arr[0].faculty_ID;
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i].faculty_ID > maxFacultyID) 
                maxFacultyID = arr[i].faculty_ID;
            
        }
        return maxFacultyID;
    }

    private static int countingSort(Faculty[] arr, int exp) 
    {
        int n = arr.length;
        Faculty[] output = new Faculty[n];
        int[] count = new int[10];
        int[] facultyIDArray = new int[n];

        int swapCount = 0;

        for (int i = 0; i < n; i++) 
        {
            facultyIDArray[i] = (arr[i].faculty_ID / exp) % 10;
            count[facultyIDArray[i]]++;
        }

        for (int i = 1; i < 10; i++) 
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) 
        {
            int index = count[facultyIDArray[i]] - 1;
            output[index] = arr[i];

            if (index != i)
                swapCount++;
            
            count[facultyIDArray[i]]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
        return swapCount;
    }

    public static void main(String[] args) 
    {
        Faculty[] facultyArray = {
            new Faculty(1793, "Kittu", new int[] {101, 102}, new String[] {"ClassA", "ClassB"}),
            new Faculty(7452, "Ruchu", new int[] {103}, new String[] {"ClassC"}),
            new Faculty(1204, "Ishu", new int[] {104, 105}, new String[] {"ClassD", "ClassE"}),
            new Faculty(1981, "Chiku", new int[] {106}, new String[] {"ClassF"})
        };

        System.out.println("Original Faculty Array: ");
        for (Faculty faculty : facultyArray)
            System.out.println("ID: " + faculty.faculty_ID + " Name: " + faculty.faculty_name);

        radixSort(facultyArray);

        System.out.println("\nSorted Faculty Array: ");
        for (Faculty faculty : facultyArray) {
            System.out.println("ID: " + faculty.faculty_ID + " Name: " + faculty.faculty_name);
        }
    }
}
