package EjerciciosTema4;

public abstract class SmartDevices {

    String manufacturer;
    String model;
    int year;
    String chargerType;



        public SmartDevices(){
    }

    public SmartDevices(String manufacturer, String model, int year, String chargerType){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.chargerType = chargerType;
    }

}
