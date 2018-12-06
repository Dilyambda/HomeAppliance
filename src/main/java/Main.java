import enums.Colors;
import enums.DeviceBrand;

public class Main {

    public static void main(String[] args) {

        Fridge fridge1 = new Fridge(44, 19, Colors.WHITE, DeviceBrand.ZANUSSI, 1.2);
        fridge1.setNight(true);
        fridge1.setTurnedOn();
        fridge1.getcameraAmount();

        Fridge fridge2 = new Fridge(13, 20, Colors.WHITE, DeviceBrand.SAMSUNG, 1.1);
        fridge2.setTurnedOn();

        Fridge fridge3 = new Fridge(40, 4, Colors.WHITE, DeviceBrand.SAMSUNG, 1.1);
        fridge3.setTurnedOff();

        Kettle kettle1 = new Kettle(24, 3, Colors.BROWN, DeviceBrand.LG_ELECTRONICS, 2.1);
        kettle1.setTurnedOn();
        kettle1.setTurnedOff();
        kettle1.isHasWater();

        Kettle kettle2 = new Kettle(28, 5, Colors.BLACK, DeviceBrand.PHILLIPS, 0.7);
        kettle2.setNight(true);
        kettle2.setTurnedOn();
        kettle2.pressButton();

        Kettle kettle3 = new Kettle(22, 4, Colors.BLACK, DeviceBrand.PHILLIPS, 1.1);
        kettle3.pressButton();
        kettle3.setTurnedOn();

        Iron iron1 = new Iron(23, 2, Colors.GREY, DeviceBrand.SAMSUNG, 1.24);
        iron1.setNight(true);
        iron1.setTurnedOn();
        iron1.addWater();

        Iron iron2 = new Iron(54, 3, Colors.BROWN, DeviceBrand.ELECTROLUX, 3.1);
        iron2.setNight(true);
        iron2.setTurnedOff();

        Iron iron3 = new Iron(40, 4, Colors.WHITE, DeviceBrand.BOSCH, 3.2);
        iron3.setTurnedOn();

        System.out.println("Appliances in electrical network:");
        ElectricityAppliancesConnection.outputTurnedOn();
        System.out.println("Summary capacity of turned appliances: " + ElectricityAppliancesConnection.summaryCapacityOfTurnedOn());

        System.out.println("\nAll appliances:");
        ElectricityAppliancesConnection.outputAll();
        System.out.println("Summary capacity of all appliances: " + ElectricityAppliancesConnection.summaryCapacityOfAll());

        System.out.println("\nSaved(i.e comparing how many capacity could be consumed and how many really had been consumed): " + (ElectricityAppliancesConnection.summaryCapacityOfAll() - ElectricityAppliancesConnection.summaryCapacityOfTurnedOn()));

        System.out.println("\nAll appliances sorted by weight:");
        ElectricityAppliancesConnection.sortByWeight();
        ElectricityAppliancesConnection.outputAll();

        System.out.println("\nAll appliances matched by criteria:");
        ElectricityAppliancesConnection.findApplianceByCriterion(40, 4);
        ElectricityAppliancesConnection.outputAll2();

    }
}