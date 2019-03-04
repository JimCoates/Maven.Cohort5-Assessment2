package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String line1;
    String line2;
    String city;
    String state;
    String zipcode;

    public Address() {
        line1 = "";
        line2 = "";
        city = "";
        state = "";
        zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city         - city of location
     * @param state        - state of city
     * @param zipcode      - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.line1 = addressLine1;
        this.line2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return this.line1;
    }

    public void setAddressLine1(String addressLine1) {
        this.line1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.line2;
    }

    public void setAddressLine2(String addressLine2) {
        this.line2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address2 = (Address) o;
        return line1 == address2.getAddressLine1() && line2 == address2.getAddressLine2() && city == address2.getCity() &&
                state == address2.getState() && zipcode == address2.getZipcode();
    }

    @Override
    public String toString() {
        return "Address{addressLine1='" + line1 + "', addressLine2='" + line2 + "', city='" + city + "', state='" + state + "', zipcode='" + zipcode + "'}";
    }

}
