package Com.bridgelabz;

import java.util.Objects;

public class InvoiceSummary {
    private final int NoOfRides;
    private final double TotalFare;
    private final double AverageFare;

    public InvoiceSummary(int NoOfRides, double TotalFare) {
        this.NoOfRides = NoOfRides;
        this.TotalFare = TotalFare;
        this.AverageFare = this.TotalFare/this.NoOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceSummary)) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return NoOfRides == summary.NoOfRides && Double.compare(summary.TotalFare, TotalFare) == 0 && Double.compare(summary.AverageFare, AverageFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NoOfRides, TotalFare, AverageFare);
    }
}
