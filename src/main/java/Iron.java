import enums.colors;
import enums.deviceBrand;

public class Iron extends ComplexAppliance {
    private int minTemp;
    private int maxTemp;
    private int currentTemp;
    private boolean hasMeasuringCup = false;
    private boolean hasWater = false;
    private boolean hasSprinklerFunction;

    public Iron(int capacity, int weight, colors color, deviceBrand brand, double cableLength) {
        super(capacity, weight, color, brand, cableLength);
    }

    public int getMinTemperature() {
        return minTemp;
    }

    public void setMinTemperature(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getMaxTemperature() {
        return maxTemp;
    }

    public void setmaxemperature(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getCurrentTemperature() {
        return currentTemp;
    }

    public void setCurrentTemperature(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public boolean getMeasuringCup() {
        return hasMeasuringCup;
    }

    public void setMeasuringCup(boolean hasMeasuringCup) {
        this.hasMeasuringCup = hasMeasuringCup;
    }

    public boolean gethasWater() {
        return hasMeasuringCup;
    }

    public void sethasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public boolean gethasSprinklerFunction() {
        return hasMeasuringCup;
    }

    public void sethasSprinklerFunction(boolean hasSprinklerFunction) {
        if (hasSprinklerFunction) this.hasSprinklerFunction = true;
        else this.hasSprinklerFunction = false;
    }

    public void addWater(){
        if (getMeasuringCup()) if (!hasWater) {
            this.hasMeasuringCup = true;
        } else {
            this.hasMeasuringCup = false;
        }
        this.hasMeasuringCup = false;
    }


    @Override
    public String toString() {
        return "AboutIron{" + "capacity="+getCapacity() + ",weight=" + getWeight()+ ", color=" + getColor() +
                ", cableLength=" + getCableLength() + ", brand=" + getBrand() + ", isTurnedOn=" + isTurnedOn + ", isNight=" + isNight() + '}';
    }
}