// Modifier | Class | Package | Subclass | World
// public | ✔ | ✔ | ✔ | ✔
// protected | ✔ | ✔ | ✔ | ✖
// default | ✔ | ✔ | ✖ | ✖
// private | ✔ | ✖ | ✖ | ✖


// File: com/example1/MainClass.java
package com.example1;

public class MainClass {
    public String publicVar = "I'm public!";
}


// File: com/example2/OtherClass.java
package com.example2;
import com.example1.MainClass;

public class OtherClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        System.out.println(obj.publicVar); // ✅ Accessible
    }
}
