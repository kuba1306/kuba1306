package Food2Door;

import java.time.LocalDateTime;
import java.util.Objects;

public class Provider {
    String companyName;
    LocalDateTime dateOfOrder;

    public Provider(String companyName, LocalDateTime dateOfOrder) {
        this.companyName = companyName;
        this.dateOfOrder = dateOfOrder;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDateTime dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Provider)) return false;
        Provider provider = (Provider) o;
        return Objects.equals(companyName, provider.companyName) && Objects.equals(dateOfOrder, provider.dateOfOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, dateOfOrder);
    }
}
