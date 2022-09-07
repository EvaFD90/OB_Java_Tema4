package EjerciciosTema4;

public class SmartWatch extends SmartDevices{

    boolean heartbeatSensor;
    boolean sleepMonitor;

    public SmartWatch(){
    }

    public SmartWatch(String manufacturer, String model, int year, String chargerType, boolean heartbeatSensor, boolean sleepMonitor){
        super(manufacturer, model, year, chargerType);
        this.heartbeatSensor = heartbeatSensor;
        this.sleepMonitor = sleepMonitor;
    }
}
