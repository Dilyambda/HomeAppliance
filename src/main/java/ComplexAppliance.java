import enums.colors;
import enums.deviceBrand;

public class ComplexAppliance extends HomeAppliance {
    private boolean ButtonTurnedOn;

    public ComplexAppliance(int capacity, int weight, colors color, deviceBrand brand, double cableLength) {
        super(capacity, weight, color, brand, cableLength);
        this.ButtonTurnedOn = false;
        ElectricityAppliancesConnection.getAllAppliances().add(this);
    }

    public boolean isButtonisTurnedOn() {
        return ButtonTurnedOn;
    }

    public void setButtonTurnedOff(boolean buttonTurnedOn) {
        ButtonTurnedOn = false;
    }

    public void pressButton() {
        if (!isButtonisTurnedOn()) {
            ButtonTurnedOn = true;
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
