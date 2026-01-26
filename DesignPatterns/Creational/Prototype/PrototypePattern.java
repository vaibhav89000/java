interface Prototype {
    Prototype clone();
}

class Student implements Prototype {
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

    // Implementing clone method to create a copy of the object
    @Override
    public Prototype clone() {
        return new Student(this.age, this.rollNumber, this.name);
    }

}

public class PrototypePattern {
    public static void main(String[] args) {
        Student originalStudent = new Student(20, 101, "Alice");

        // Cloning originalStudent to create clonedStudent
        Student clonedStudent = (Student) originalStudent.clone();

        System.out.println("Original Student: " + originalStudent.name + ", Age: " + originalStudent.age);
        System.out.println("Cloned Student: " + clonedStudent.name + ", Age: " + clonedStudent.age);
    }
}
