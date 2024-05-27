package ClubMembersSortedCF.members.v1;

import java.util.Objects;

public class Residence {
   private final int postalCode;
   private final String city;
   private final String address;

    private boolean zipCodeValidator(int zipCode) {
        return zipCode >= 1000 && zipCode <= 9999;
    }

    public Residence(int postalCode, String city, String address) {
        this.postalCode = postalCode;
        this.city = city;
        this.address = address;
        if (!zipCodeValidator(this.postalCode)) {
            throw new IllegalArgumentException("Invalid postal cocde:" + postalCode);
        }
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Residence residence = (Residence) o;
        return postalCode == residence.postalCode && Objects.equals(city, residence.city) && Objects.equals(address, residence.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postalCode, city, address);
    }

    @Override
    public String toString() {
        return "Residence{" +
                "\nIrányítószám=" + postalCode +
                "\nTelepülés='" + city + '\'' +
                "\nCím='" + address + '\'';
    }
}
