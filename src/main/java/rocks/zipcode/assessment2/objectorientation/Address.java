package rocks.zipcode.assessment2.objectorientation;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */

    String fAddrLine;
    String sAddrLine;
    String aCity;
    String aState;
    String zip;

    public Address() {
        this.fAddrLine = "";
        this.sAddrLine = "";
        this.aCity = "";
        this.aState = "";
        this.zip = "";
    }

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.fAddrLine = addressLine1;
        this.sAddrLine = addressLine2;
        this.aCity = city;
        this.aState = state;
        this.zip = zipcode;
    }

    public String getAddressLine1() {

        return this.fAddrLine;
    }

    public void setAddressLine1(String addressLine1) {
        this.fAddrLine = addressLine1;
    }

    public String getAddressLine2() {

        return this.sAddrLine;
    }

    public void setAddressLine2(String addressLine2) {
        this.sAddrLine = addressLine2;
    }

    public String getCity() {

        return this.aCity;
    }

    public void setCity(String city) {
        this.aCity = city;
    }

    public String getState() {

        return this.aState;
    }

    public void setState(String state) {
        this.aState = state;
    }

    public String getZipcode() {

        return this.zip;
    }

    public void setZipcode(String zipcode) {
        this.zip = zipcode;
    }

    @Override
    public String toString() {
        return String.format("Address{addressLine1=" + "'" + fAddrLine + "'" + "," +
                " addressLine2=" + "'" + sAddrLine + "'" + "," +
                " city=" + "'" + aCity + "'" + "," +
                " state=" + "'" + aState + "'" + "," +
                " zipcode=" + "'" + zip + "'" +
                "}");
    }

    @Override
    public boolean equals(Object o) {
        Address addr = (Address) o;
        Boolean ret = false;
        if (o == null) {
            ret = false;
        } else if (this.fAddrLine.equals(addr.getAddressLine1()) && this.sAddrLine.equals(addr.getAddressLine2())
                && this.aCity.equals(addr.getCity()) && this.aState.equals(addr.getState())
                && this.zip.equals(addr.getZipcode())) {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }
}
