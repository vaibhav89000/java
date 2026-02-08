
interface weightMachine {
    public double getWeightInKg();
}

interface weightMachineAdapter {
    public double getWeightInPounds();
}

class WeightMachineImpl implements weightMachine {
    public double weight;

    public WeightMachineImpl(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeightInKg() {
        return this.weight;
    }
}

class WeightMachineAdapterImpl implements weightMachineAdapter {
    private weightMachine weightMachine;

    public WeightMachineAdapterImpl(weightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInPounds() {
        return weightMachine.getWeightInKg() * 2.20462262;
    }
}


public class Adapter {
    public static void main(String[] args) {

        weightMachine wm = new WeightMachineImpl(10); // 10 kg
        weightMachineAdapter wma = new WeightMachineAdapterImpl(wm);
        System.out.println("Weight in kg: " + wm.getWeightInKg());
        System.out.println("Weight in pounds: " + wma.getWeightInPounds());        
    }
}
