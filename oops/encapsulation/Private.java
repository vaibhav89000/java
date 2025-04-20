package com.example;

public class PrivateExample {
    private String secret = "Hidden";

    private void showSecret() {
        System.out.println(secret);
    }

    public void accessSecret() {
        showSecret(); // ✅ accessible within class
    }
}


// Different class
package com.example;

public class Test {
    public static void main(String[] args) {
        PrivateExample pe = new PrivateExample();
        // System.out.println(pe.secret); ❌
        // pe.showSecret(); ❌
        pe.accessSecret(); // ✅
    }
}
