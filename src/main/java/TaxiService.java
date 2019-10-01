public class TaxiService {
    double submissionCost = 60;
    double kmCost = 20;
    double percentDiscount = 0.95;
    int maxDiscount = 100;
    int sumWithDiscount = 1000;

    double pricePerTrip(double distance) {
        double price = kmCost * distance + submissionCost;
        if (price > sumWithDiscount) {
            double discountPrice = price * percentDiscount;
            if (price - discountPrice > maxDiscount) {
                price -= maxDiscount;
            } else {
                price = discountPrice;
            }
        }
        return price;
    }

}

