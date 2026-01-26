
class Button {
    void paint() {
        System.out.println("Rendering a button.");
    }
}

class Checkbox {
    void paint() {
        System.out.println("Rendering a checkbox.");
    }
}

class WindowsButton extends Button {
    @Override
    void paint() {
        System.out.println("Rendering a Windows button.");
    }
}
class MacButton extends Button {
    @Override
    void paint() {
        System.out.println("Rendering a Mac button.");
    }
}
class WindowsCheckbox extends Checkbox {
    @Override
    void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}
class MacCheckbox extends Checkbox {
    @Override
    void paint() {
        System.out.println("Rendering a Mac checkbox.");
    }
}           

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}   

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}                   


class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        // Example usage of Abstract Factory Pattern
        GUIFactory factory = getFactory("Windows");
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }

    public static GUIFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Windows")) {
            return new WindowsFactory();
        } else if (type.equalsIgnoreCase("Mac")) {
            return new MacFactory();
        }
        throw new IllegalArgumentException("Unknown factory type");
    }       
}
