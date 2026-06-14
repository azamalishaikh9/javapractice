package java8;

public class Address {
    private long addressId;
    private long pincode;

    public Address(long addressId, long pincode) {
        this.addressId = addressId;
        this.pincode = pincode;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", pincode=" + pincode +
                '}';
    }
}
