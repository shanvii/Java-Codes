/*23MCA10122 
Satakshi Shanvi
Write a program to implement Binary search on 1D array of Employee structure 
(contains employee_name, emp_no, emp_salary), with key as emp_no. 
And count the number of comparison happened */

import java.util.Scanner;

class Employee 
{

    int emp_no;
    String emp_name;
    int emp_sal;

    public Employee(int emp_no, String emp_name, int emp_sal) 
    {
        this.emp_no = emp_no;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }
}

public class BinarySearchDSA11 
{

    int search(Employee[] emp, int key) 
    {
        int low = 0;
        int high = emp.length - 1;
        int mid, count = 0;

        while (low < high) 
        {
            count++;
            mid = (low + high) / 2;

            if (emp[mid].emp_no == key) 
            {
                System.out.println("Employee found after " + count + " comparisons.");
                return mid;
            }

            else if (emp[mid].emp_no < key)
                low = mid + 1;

            else
                high = mid - 1;
        }

        System.out.println("Employee not found after " + count + " comparisons.");
        return -1;
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        BinarySearchDSA11 obj = new BinarySearchDSA11();

        Employee emp[] = {
                new Employee(1001, "Chiku", 80000),
                new Employee(1002, "Ruchu", 75000),
                new Employee(1003, "Kittu", 70000),
                new Employee(1004, "Ishu", 70000)
        };

        System.out.print("Enter Emp no to be searched: ");
        int key = sc.nextInt();

        int result = obj.search(emp, key);

        if (result != -1) {
            Employee foundEmployee = emp[result];
            System.out.print("Employee Name: " + foundEmployee.emp_name);
            System.out.print("  Employee Salary: " + foundEmployee.emp_sal);
        }

        sc.close();;
    }
}
