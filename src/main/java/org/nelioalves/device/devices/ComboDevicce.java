package org.nelioalves.device.devices;

public class ComboDevicce extends Device implements Scanner, Printer {
    public ComboDevicce(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}
