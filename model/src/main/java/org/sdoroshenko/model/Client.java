package org.sdoroshenko.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private List<Address> addresses;

    public Client() {
        addresses = new ArrayList<>();
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }
}
