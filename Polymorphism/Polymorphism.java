//polymorphism

// Parent class - ManagementSystem
class ManagementSystem {
    public String name;

    //constructor of type public
    public ManagementSystem(String name) {
        this.name = name;
    }

    //function displayInfo of type public

    public void polymorphicMethod() {
        System.out.println("This is " + name + " Management System.");
    }
}

// Derived class - LibraryManagement from ManagementSystem
class LibraryManagement extends ManagementSystem {
    private int bookCount;

    public LibraryManagement(String name, int bookCount) {
        //super keyword
        super(name);
        super.polymorphicMethod();
        this.bookCount = bookCount;
    }

    //overridden function
    @Override
    public void polymorphicMethod() {
        System.out.println("Library Name: " + name);
        System.out.println("Total Books Available: " + bookCount);
    }
}

// Derived class - SchoolManagement from ManagementSystem
class CollegeManagement extends ManagementSystem {
    //private integer data type
    private int studentCount;

    public CollegeManagement(String name, int studentCount) {
        super(name);
        super.polymorphicMethod();
        this.studentCount = studentCount;
    }

    @Override
    public void polymorphicMethod() {
        System.out.println("College Name: " + name);
        System.out.println("Total Students Enrolled: " + studentCount);
    }
}

// Derived class - CUIMS from CollegeManagement
class CUIMS extends CollegeManagement {
    CUIMS(String name, int studentCount) {
        super(name, studentCount);
    }
}

// Derived class - CUIMS from CollegeManagement
class VTOP extends CollegeManagement {
    VTOP(String name, int studentCount) {
        super(name, studentCount);
    }
}

// Derived class - HostelManagement from ManagementSystem
class HostelManagement extends ManagementSystem {
    int roomCount;

    public HostelManagement(String name, int roomCount) {
        super(name);
        super.polymorphicMethod();
        this.roomCount = roomCount;
    }

    @Override
    public void polymorphicMethod() {
        System.out.println("Hostel Name: " + name);
        System.out.println("Total Rooms Available: " + roomCount);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        //objects created for different classes
        LibraryManagement library = new LibraryManagement("Central Library", 5000);
        CollegeManagement college = new CollegeManagement("ABC University", 10000);
        HostelManagement hostel = new HostelManagement("XYZ Hostel", 200);

        library.polymorphicMethod();

        //to leave line
        System.out.println();

        college.polymorphicMethod();

        System.out.println();

        CUIMS cuims = new CUIMS("Chandigarh University", 50000);
        cuims.polymorphicMethod();

        System.out.println();

        VTOP vtop = new VTOP("VIT", 50000);
        vtop.polymorphicMethod();

        System.out.println();

        hostel.polymorphicMethod();

        System.out.println();
    }
}
