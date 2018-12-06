import enums.Colors;
import enums.DeviceBrand;

public class ComplexAppliance extends HomeAppliance {
    private boolean buttonTurnedOn;

    public ComplexAppliance(int capacity, int weight, Colors color, DeviceBrand brand, double cableLength) {
        super(capacity, weight, color, brand, cableLength);
        this.buttonTurnedOn = false;
        ElectricityAppliancesConnection.getAllAppliances().add(this);
    }

    public boolean isButtonisTurnedOn() {
        return buttonTurnedOn;
    }

    public void setButtonTurnedOff(boolean buttonTurnedOn) {
        buttonTurnedOn = false;
    }

    public void pressButton() {
        if (!isButtonisTurnedOn()) {
            buttonTurnedOn = true;
        }
    }

    @Override
    public void setTurnedOn(){
        ElectricityAppliancesConnection.getAppliancesTurnedOn().add(this);
        pressButton();
        this.isTurnedOn=true;
    }

    @Override
    public void setTurnedOff(){
        ElectricityAppliancesConnection.getAppliancesTurnedOn().remove(this);
        this.isTurnedOn=false;
    }

}
