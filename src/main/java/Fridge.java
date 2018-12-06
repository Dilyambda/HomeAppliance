import enums.Colors;
import enums.DeviceBrand;

public class Fridge extends SimpleAppliance {
    private boolean hasIceBox;
    private int cameraAmount;

    public Fridge(int capacity, int weight, Colors color, DeviceBrand brand, double cableLengt) {
        super(capacity, weight, color, brand, cableLengt);
    }

    public boolean gethasIceBox() {
        return hasIceBox;
    }

    public void sethasIceBox(boolean hasIceBox) {
        this.hasIceBox = hasIceBox;
    }

    public int getcameraAmount() {
        return cameraAmount;
    }

    @Override
    public String toString() {
        return "AboutFridge{" + "capacity=" + getCapacity() + ",weight=" + getWeight() + ", color=" + getColor() +
                ", cableLength=" + getCableLength() + ", brand=" + getBrand() + ", isTurnedOn=" + isTurnedOn + ", isNight=" + isNight() + '}';
    }

}
