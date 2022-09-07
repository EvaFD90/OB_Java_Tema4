package EjerciciosTema4;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("Samsung", "S9+", 2019, "C", "Dual camera", 64);

        System.out.println(smartPhone1.manufacturer);
        System.out.println(smartPhone1.model);
        System.out.println(smartPhone1.year);
        System.out.println(smartPhone1.camera);
        System.out.println(smartPhone1.phoneMemory);

        SmartWatch smartWatch1 = new SmartWatch("Xiaomi", "S1 Active", 2020, "Wireless", true, true );

        System.out.println(smartWatch1.manufacturer);
        System.out.println(smartWatch1.model);
        System.out.println(smartWatch1.heartbeatSensor);
        System.out.println(smartWatch1.sleepMonitor);
        
    }
}
