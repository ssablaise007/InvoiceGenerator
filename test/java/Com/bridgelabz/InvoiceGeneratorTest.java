package Com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    public void givenDistanceTime_ShouldReturnFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25, fare , 0.0);
    }
    @Test
    public void givenLessDistance_ShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }
    @Test
    public void GivenMultipleRides_ShouldReturnInvoiceSummary(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {  new Ride(2.0, 5),
                        new Ride(0.1, 1)
                        };
        InvoiceSummary  summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary (2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary,summary);
    }
}
