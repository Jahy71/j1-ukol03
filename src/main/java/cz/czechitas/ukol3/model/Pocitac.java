package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;


    public boolean jeZapnuty() {
        return this.jeZapnuty;
    }

    public void zapniSe() {
        if (cpu != null && ram != null && pevnyDisk != null) {
            if (jeZapnuty) {
                System.err.println("ERROR: Počítač je již zapnutý.");
            } else {
                jeZapnuty = true;
                System.out.println("Počítač se právě zapnul.");
            }
        } else {
            System.err.println("ERROR: Počítači chybí komponenty.");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se právě vypnul.");
        }
    }


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac: " +
                cpu + ", " +
                ram + ", " +
                pevnyDisk;
    }
}
