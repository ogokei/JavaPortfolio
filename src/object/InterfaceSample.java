package object;

public class InterfaceSample {

    public static void main(String[] args) {

        InterfaceEmployee emp01;
        InterfaceEmployee emp02;

        emp01 = new EmployeeSalesInterface();
        emp02 = new EmployeeSystemInterface();

        emp01.greeting();
        emp02.greeting();

        newGreeting(emp01);
        newGreeting(emp02);
    }

    static void newGreeting(InterfaceEmployee ie) {
        System.out.println("ポリモーフィズムです");
        ie.greeting();
    }

}