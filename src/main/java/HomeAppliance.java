import enums.colors;
import enums.deviceBrand;

public class HomeAppliance implements Comparable<HomeAppliance> {
    private final static double CAPACITY_RATIO = 0.5;
    private int capacity;
    private int weight;
    private enums.colors color;
    private deviceBrand brand;
    private double cableLength;
    protected boolean isTurnedOn;
    private boolean isNight;

    public HomeAppliance(int capacity, int weight, colors color, deviceBrand brand, double cableLength) {
        this.capacity = capacity;
        this.weight = weight;
        this.color = color;
        this.brand = brand;
        this.cableLength = cableLength;
        this.isTurnedOn = false;
        this.isNight = false;
    }

    public void setTurnedOn(){
    }

    public void setTurnedOff(){
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setCapacity(int capacity) {
            this.capacity = capacity;
    }

        public int getCapacity() {
        int tmp;
            if (isNight()) {
                tmp = (int) (CAPACITY_RATIO  * capacity);
            } else {
                tmp = capacity;
            }
        return tmp;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public colors getColor() {
        return color;
    }

    public void setcolor(colors color) {
        this.color = color;
    }

    public deviceBrand getBrand() {
        return brand;
    }

    public void setbrand(deviceBrand brand) {
        this.brand = brand;
    }

    public double getCableLength() {
        return cableLength;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }

    public boolean isNight() {
        return isNight;
    }

    public void setNight(boolean night) {
        isNight = night;
    }


    @Override
    public String toString() {
        return "AboutHomeAppliances{" + "capacity=" + capacity + ", weight=" + weight + ", color=" + color +
                ", cableLength=" + getCableLength() + ", brand=" + brand + ", isTurnedOn=" + isTurnedOn + ", isNight=" + isNight + '}';
    }

    @Override
    public int compareTo(HomeAppliance o1) {
       return o1.getWeight() - this.getWeight();
    }
}