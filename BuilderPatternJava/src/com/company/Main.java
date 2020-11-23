package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Computer pc1 = new Computer.ComputerBuilder("16GB","1600GB","2.5GHz").build();
        Computer pc2 = new Computer.ComputerBuilder("8GB","160GB","2.5GHz")
                .setBluetootEnabled(true)
                .setGraphicCardEnabled(true)
                .build();
    }
}
