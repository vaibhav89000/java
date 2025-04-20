class Vehicle{
    String vehicle_type;
    String vehicle_number;
    
    public Vehicle(String vehicle_type, String vehicle_number){
        this.vehicle_type = vehicle_type;
        this.vehicle_number = vehicle_number;
    }
    
    public void display_details(){
        System.out.println(this.vehicle_type+"-"+this.vehicle_number);
    }
}

class Car extends Vehicle{
    public Car(String vehicle_number){
        super("CAR", vehicle_number);
    }
}

class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("DL-1234");
        car.display_details();
    }
}
