// File: com/base/Parent.java
package com.base;

public class Parent {
    protected String protectedMsg = "Protected access";

    protected void showMsg() {
        System.out.println(protectedMsg);
    }
}

// File: com/child/Child.java
package com.child;
import com.base.Parent;

public class Child extends Parent {
    public void accessParent() {
        System.out.println(protectedMsg); // ✅ subclass access
        showMsg();                        // ✅
    }
}


// File: com/unrelated/Unrelated.java
package com.unrelated;
import com.base.Parent;

public class Unrelated {
    public static void main(String[] args) {
        Parent obj = new Parent();
        // obj.protectedMsg ❌ not accessible
        // obj.showMsg(); ❌
    }
}

