package EjerciciosTema4;

public class SmartPhone extends SmartDevices{

    String camera;
    int phoneMemory;



    public SmartPhone(){
    }

    public SmartPhone(String manufacturer, String model, int year, String chargerType, String camera, int phoneMemory) {
        super(manufacturer, model, year, chargerType);
        this.camera = camera;
        this.phoneMemory = phoneMemory;
    }
}
