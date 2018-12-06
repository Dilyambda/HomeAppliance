import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectricityAppliancesConnection {
    private static List<HomeAppliance> appliancesTurnedOn = new ArrayList<>();
    private static List<HomeAppliance> allAppliances = new ArrayList<>();
    private static List<HomeAppliance> appliancesByCriteria = new ArrayList<>();

    public static List<HomeAppliance> getAllAppliances() {
        return allAppliances;
    }

    public static List<HomeAppliance> getAppliancesTurnedOn() {
        return appliancesTurnedOn;
    }

    public static List<HomeAppliance> getAppliancesByCriteria() {
        return appliancesByCriteria;
    }


    public static void outputTurnedOn() {
        for (HomeAppliance homeAppliance : appliancesTurnedOn) {
            System.out.println(homeAppliance);
        }
    }

    public static void outputAll() {
        for (HomeAppliance allAppliance : allAppliances) {
            System.out.println(allAppliance);
        }
    }

    public static void sortByWeight() {
        Collections.sort(allAppliances);
    }


    public static List<HomeAppliance> findApplianceByCriterion(int capacity, int weight) {
        for (HomeAppliance appliance : allAppliances) {
            if (appliance.getCapacity() == capacity && appliance.getWeight() == weight)
                appliancesByCriteria.add(appliance);
        }
        return appliancesByCriteria;
    }

    public static void outputAll2() {
        for (HomeAppliance allAppliance : appliancesByCriteria) {
            System.out.println(allAppliance);
        }
    }


    public static int summaryCapacityOfTurnedOn() {
        int totalCapacity = 0;
        for (HomeAppliance homeAppliance : appliancesTurnedOn) {
            totalCapacity += homeAppliance.getCapacity();
        }
        return totalCapacity;
    }

    public static int summaryCapacityOfAll() {
        int totalCapacity = 0;
        for (HomeAppliance homeAppliance : allAppliances) {
            totalCapacity += homeAppliance.getCapacity();
        }
        return totalCapacity;
    }
}