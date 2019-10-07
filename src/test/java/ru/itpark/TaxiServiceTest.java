package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    @DisplayName("Must be calculated price")
    void calculatePrice() {

        var service = new TaxiService();
        var result = service.pricePerTrip(3);


        assertEquals(120, result);
    }

    @Test
    @DisplayName("Must be calculated max discount")
    void calculateMaxDiscount() {
        var service = new TaxiService();
        var result = service.pricePerTrip(100);
        assertEquals(1960, result);

    }
}