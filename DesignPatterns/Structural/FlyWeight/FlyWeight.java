import java.util.HashMap;
import java.util.Map;

interface RobotI {
    void display(int x, int y);
}

class Sprite {
    private String name;

    public Sprite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class HumanoidRobot implements RobotI {
    private String type;
    private Sprite sprite;

    public HumanoidRobot(String type, Sprite sprite) {
        this.type = type;
        this.sprite = sprite;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Humanoid Robot: " + type + " at position (" + x + ", " + y + ")");
    }
}


class DogRobot implements RobotI {
    private String type;
    private Sprite sprite;

    public DogRobot(String type, Sprite sprite) {
        this.type = type;
        this.sprite = sprite;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Dog Robot: " + type + " at position (" + x + ", " + y + ")");
    }
}

class RobotFactory {
    private static final Map<String, RobotI> robotMap = new HashMap<>();

    public static RobotI getRobot(String type) {
        if(robotMap.containsKey(type)){
            return robotMap.get(type);
        }
        if (type == "HUMANOID") {
            Sprite humanoidSprite = new Sprite("HUMANOID_SPRITE");
            robotMap.put(type, new HumanoidRobot(type, humanoidSprite));
        } 
        else if (type == "DOG") {
            Sprite dogSprite = new Sprite("DOG_SPRITE");
            robotMap.put(type, new DogRobot(type, dogSprite));
        } else {
            throw new IllegalArgumentException("Unknown robot type: " + type);   
        }
        return robotMap.get(type);
    }

}

public class FlyWeight {
    public static void main(String[] args){
        RobotI humanoid = RobotFactory.getRobot("HUMANOID");
        RobotI dog = RobotFactory.getRobot("DOG");


        humanoid.display(10, 20);
        humanoid.display(30, 40);
        dog.display(50, 60);
        dog.display(70, 80);
    }
}
