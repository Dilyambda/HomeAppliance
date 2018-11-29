import enums.colors;
import enums.deviceBrand;

public class Kettle extends ComplexAppliance {
    private int currentTemp;
    private int boilingTime;
    private boolean hasWater = false;

    public Kettle(int capacity, int weight, colors color, deviceBrand brand, double cableLengt) {
        super(capacity, weight, color, brand, cableLengt);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getBoilingTime() {
        return boilingTime;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setBoilingTime(int boilingTime) {
        this.boilingTime = boilingTime;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public int getCurrentTemperature() {
        return currentTemp;
    }

    public void setCurrentTemperature(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public String toString() {
        return "AboutKettle{" + "capacity="+ getCapacity() + ",weight=" + getWeight()+ ", color=" + getColor() +
                ", cableLength=" + getCableLength() + ", brand=" + getBrand() + ", isTurnedOn=" + isTurnedOn + ", isNight=" + isNight() + '}';
    }
}
