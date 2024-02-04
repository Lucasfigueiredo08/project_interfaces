package org.nelioalves.device.application;

import org.nelioalves.device.devices.ComboDevicce;
import org.nelioalves.device.devices.ConcretePrinter;
import org.nelioalves.device.devices.ConcreteScanner;

public class Program {

    public static void main(String[] args) {
        ConcretePrinter concretePrinter = new ConcretePrinter("1088");
        concretePrinter.processDoc("my letter");
        concretePrinter.print("my letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());

        ComboDevicce c = new ComboDevicce("2084");
        c.processDoc("my teste");
        c.print("my teste");
    }
}
