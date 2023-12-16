// Demonstrate public, private and protected access specifiers by taking suitable and logical class members.

//class demo
class demo {
    private String name = "Satakshi"; //private variable name
    public String regNo = "23MCA10122"; //public variable regNo
    String stream = "MCA"; //default stream
    protected int marks = 99; //protected integer variable marks

    //private function
    private void Name() {
        name = "Shanvi";
    }

    //no access specifier - default
    void registrationNo() {
        regNo = "20BCA1494";
    }

    //protected function
    protected void marks() {
        marks = 100;
    }

    //constructor
    demo() {
        System.out.println("\nIn the same class");
        System.out.println("Name: " + name + "\nRegistration no: " + regNo + "\nStream: " + stream + "\nMarks: " + marks);
    }
}

//class demo2
class demo2 {
    //display function of demo2 class
    void display() {
        
        //object of demo2
        demo obj = new demo();

        System.out.println("\nIn different class");

        //name varibale is private and cannot be accessed
        // System.out.println("Name: " + obj.name + "\nRegistration no: " + obj.regNo + "\nStream: " + obj.stream);

        System.out.println("Registration no: " + obj.regNo + "\nStream: " + obj.stream + "\nMarks: " + obj.marks);

        //private function cannot be called
        // obj.Name();

        //function call
        obj.registrationNo();
        System.out.println("Registration no: " + obj.regNo + "\nStream: " + obj.stream + "\nMarks: " + obj.marks);
    }
}

public class accessSp {
    public static void main(String[] args) {
        //object of demo2 class
        demo2 obj2 = new demo2();
        obj2.display();
    }
}
