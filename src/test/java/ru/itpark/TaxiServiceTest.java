package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    @DisplayName("Must be calculated without discount")
    void calculatePrice() {
        var service = new TaxiService();
        var result = service.pricePerTrip(5);
        assertEquals(160, result);
    }

    @Test
    @DisplayName("Must be calculated with discount")
    void calculateWithDiscount() {
        var service = new TaxiService();
        var result = service.pricePerTrip(50);
        assertEquals(1007, result);
    }

    @Test
    @DisplayName("Must be calculated max discount")
    void calculateWithMaxDiscount() {
        var service = new TaxiService();
        var result = service.pricePerTrip(100);
        assertEquals(1960, result);

    }


}