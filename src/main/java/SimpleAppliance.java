import enums.colors;
import enums.deviceBrand;

public class SimpleAppliance extends HomeAppliance {

    public SimpleAppliance(int capacity, int weight, colors color, deviceBrand brand, double cableLength) {
        super(capacity, weight, color, brand, cableLength);
        ElectricityAppliancesConnection.getAllAppliances().add(this);
    }

    @Override
    public void setTurnedOn(){
        ElectricityAppliancesConnection.getAppliancesTurnedOn().add(this);
        this.isTurnedOn=true;
    }

    @Override
    public void setTurnedOff(){
        ElectricityAppliancesConnection.getAppliancesTurnedOn().remove(this);
        this.isTurnedOn=false;
    }


}
