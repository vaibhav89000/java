// Prototype pattern is needed to create new objects by copying an existing object 
// when object creation is expensive, complex, or slow.

class Student{
    int age;
    private int rollNumber;
    String name;

    Student() {
    }

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

}

public class NeedForPrototype {

    public static void main(String[] args) {
        Student obj = new Student(20, 101, "Alice");

        // Cloning student1 to create student2
        Student cloneObj = new Student();
        cloneObj.age = obj.age;
        cloneObj.name = obj.name;
        // Error: rollNumber has private access in Student (So we cannot access it here)
        // cloneObj.rollNumber = obj.rollNumber; 
    }

}