package com.company;

public class Computer {
    private String ram;
    private String hdd;
    private String cpu;

    private boolean isBluetootEnabled;
    private boolean isGraphicCardEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd =builder.hdd;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.isBluetootEnabled = builder.isBluetootEnabled;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public boolean isBluetootEnabled() {
        return isBluetootEnabled;
    }

    public void setBluetootEnabled(boolean bluetootEnabled) {
        isBluetootEnabled = bluetootEnabled;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        isGraphicCardEnabled = graphicCardEnabled;
    }

    // napravimo unutrasnju klasu builder kojicemo koristiti za pravljenje
    // ovog kompleksnog objekta

    public static class ComputerBuilder{
        private String ram;
        private String hdd;
        private String cpu;

        private boolean isBluetootEnabled;
        private boolean isGraphicCardEnabled;

        public ComputerBuilder() {
        }

        public ComputerBuilder(String ram, String hdd,String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }



        public ComputerBuilder setBluetootEnabled(boolean bluetootEnabled) {
           this.isBluetootEnabled = bluetootEnabled;
           return this;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
            this.isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
