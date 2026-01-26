class Student {

    // required fields
    private String name;
    private int age;

    // optional fields
    private String department;
    private String address;
    private String phone;
    private String grade;

    // private constructor
    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.address = builder.address;
        this.phone = builder.phone;
        this.grade = builder.grade;
    }

    // static inner Builder class
    public static class Builder {
        private String name;
        private int age;
        private String department;
        private String address;
        private String phone;
        private String grade;

        // mandatory fields via constructor
        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder grade(String grade) {
            this.grade = grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age +
                ", department='" + department + "', address='" + address +
                ", phone='" + phone + "', grade='" + grade + "'}";
    }
}

public class Builder {
      public static void main(String[] args) {

        Student student = new Student.Builder("Vaibhav", 22)
                .department("Computer Science")
                .address("Bangalore")
                .phone("9999999999")
                .grade("A")
                .build();

        System.out.println(student);
    }
}
