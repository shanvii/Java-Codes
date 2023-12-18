import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSingle Inheritance");
        Students objs = new Students();
        objs.name();
        objs.Study();

        System.out.println("\nMultilevel Inheritance");
        hod objm = new hod();
        objm.sinfo();
        objm.pinfo();
        objm.hinfo();

        System.out.println("\nHierarchial Inheritance");
        cam obj = new cam();
        tee obj2 = new tee();
        System.out.println("Total marks: " + obj.marks + " and Continuous Assesment marks: " + obj.cmarks);
        System.out.println("Total marks: " + obj2.marks + " and Term End marks: " + obj2.tmarks);

        scanner.close();
    }
}

class University {
    void name() {
        System.out.println("VIT University");
    }
}

class Students extends University {
    void Study() {
        System.out.println("Student studies in VIT");
    }
}

class student {
    void sinfo() {
        System.out.println("Student");
    }
}

class proctor extends student {
    void pinfo() {
        System.out.println("Proctor");
    }
}

class hod extends proctor {
    void hinfo() {
        System.out.println("Department Head");
    }
}

class totalMarks {
    int marks = 100;
}

class cam extends totalMarks {
    int cmarks = 70;
}

class tee extends totalMarks {
    int tmarks = 30;
}
