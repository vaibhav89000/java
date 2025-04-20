package com.mypackage;

class PackageClass {
    void defaultMethod() {
        System.out.println("Default access");
    }
}


package com.mypackage;

public class SamePackage {
    public static void main(String[] args) {
        PackageClass pc = new PackageClass();
        pc.defaultMethod(); // ✅
    }
}


package com.otherpackage;

import com.mypackage.PackageClass;

public class OtherPackage {
    public static void main(String[] args) {
        // PackageClass pc = new PackageClass(); ❌ Not accessible
    }
}

