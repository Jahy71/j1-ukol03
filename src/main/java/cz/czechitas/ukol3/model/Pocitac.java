package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;

    private Long vytvorSouborOVelikosti;

    private Long vymazSouboryOVelikosti;


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

    public Long getVytvorSouborOVelikosti() {
        return vytvorSouborOVelikosti;
    }

    public void setVytvorSouborOVelikosti(Long vytvorSouborOVelikosti) {
        if (vytvorSouborOVelikosti > (getPevnyDisk().getKapacita() - getPevnyDisk().getVyuziteMisto())) {
            System.err.println("ERROR: Nedostatek místa na disku.");
        } else {
            pevnyDisk.setVyuziteMisto(vytvorSouborOVelikosti + pevnyDisk.getVyuziteMisto());
        }
        this.vytvorSouborOVelikosti = vytvorSouborOVelikosti;
    }


    public Long getVymazSouboryOVelikosti() {
        return vymazSouboryOVelikosti;
    }


    public void setVymazSouboryOVelikosti(Long vymazSouboryOVelikosti) {
        if (vymazSouboryOVelikosti > pevnyDisk.getVyuziteMisto()) {
            System.err.println("ERROR: Takové místo nenív paměti.");
        } else {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - vymazSouboryOVelikosti);
        }
        this.vymazSouboryOVelikosti = vymazSouboryOVelikosti;
    }


    @Override
    public String toString() {
        return "Pocitac: " +
                cpu + ", " +
                ram + ", " +
                "vytvor soubor o velikosti: " + vytvorSouborOVelikosti + " B, " +
                "vymaz soubor o velikosti: " + vymazSouboryOVelikosti + " B, " +
                pevnyDisk;

    }
}
