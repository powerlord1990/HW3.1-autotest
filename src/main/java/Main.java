public class Main {
    public static void main(String[] args) {
        TaxiService taxiRide = new TaxiService();
        double kilometer = 56;

        double totalCost = taxiRide.pricePerTrip(kilometer);
        System.out.println(totalCost);
    }
}
