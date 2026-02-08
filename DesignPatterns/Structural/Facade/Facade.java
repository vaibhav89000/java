
// The Facade Design Pattern is a structural pattern that provides a simple interface to a complex subsystem.

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class CarLights {
    public void turnOn() {
        System.out.println("Car lights turned on.");
    }
}

class MusicSystem {
    public void playMusic() {
        System.out.println("Music system is playing music.");
    }
}

class CarFacade {
    private Engine engine;
    private CarLights carLights;
    private MusicSystem musicSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.carLights = new CarLights();
        musicSystem = new MusicSystem();
    }

    public void startCar() {
        engine.start();
        carLights.turnOn();
        musicSystem.playMusic();
        System.out.println("Car is ready to go!");
    }
}

public class Facade {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
    }   
}
