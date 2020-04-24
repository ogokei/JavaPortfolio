package test;

public class ObjectSample {

    public static void main(String[] args) {
       Employee emp = new Employee();
       emp.employeeName = "大島";
       emp.divisionName = "営業部";
       emp.vitality     = 150;
       emp.introduce();
       emp.greeting();
       emp.showVitality();
    }

}
