package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;

    private Disk druhyDisk;

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


    public void vytvorSouborOVelikostiBezRozdeleniJedenDisk(long velikost) {
        if (!jeZapnuty) {
            System.out.println("CHYBA: Počítač je vypnutý - nelze vytvaret soubory.");
            return;
        }

        long zbyvajiciKapacita = pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto();

        if (velikost > zbyvajiciKapacita) {
            System.out.println("ERROR: Na zadnem z disku není dostak mista.");
        } else {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
        }
    }

    public void vytvorSouborOVelikostiBezRozdeleniDvaDisky(long velikost) {
        if (!jeZapnuty) {
            System.out.println("ERROR: Počítač je vypnutý - nelze vytvaret soubory.");
            return;
        }

        long zbyvajiciKapacitaPrvnihoDisku = pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto();
        long zbyvajiciKapacitaDruhehoDisku = druhyDisk.getKapacita() - druhyDisk.getVyuziteMisto();

        if (velikost > zbyvajiciKapacitaPrvnihoDisku && velikost > zbyvajiciKapacitaDruhehoDisku) {
            System.out.println("ERROR: Na zadnem z disku není dostak mista.");
        } else {
            if (velikost <= zbyvajiciKapacitaPrvnihoDisku) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
            } else {
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + velikost);
            }
        }
    }

    public void setVymazSouborOVelikosti(Long vymazSouborOVelikosti) {
        if (vymazSouborOVelikosti > pevnyDisk.getVyuziteMisto()) {
            System.err.println("ERROR: Takove misto neni v pameti.");
        } else {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - vymazSouborOVelikosti);
        }
    }

    /* PŮVODNÍ ŘEŠENÍ PŘIDÁNÍ A VYMAZÁNÍ SOUBORU O URČITÉ VELIKOSTI:
    public void setVytvorSouborOVelikosti(Long vytvorSouborOVelikosti) {
        if (vytvorSouborOVelikosti > (getPevnyDisk().getKapacita() - getPevnyDisk().getVyuziteMisto())) {
            System.err.println("ERROR: Nedostatek místa na disku.");
        } else {
            pevnyDisk.setVyuziteMisto(vytvorSouborOVelikosti + pevnyDisk.getVyuziteMisto());
        }
    }

    public void setVymazSouboryOVelikosti(Long vymazSouboryOVelikosti) {
        if (vymazSouboryOVelikosti > pevnyDisk.getVyuziteMisto()) {
            System.err.println("ERROR: Takové místo nenív paměti.");
        } else {
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - vymazSouboryOVelikosti);
        }
    }
    */

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac: " +
                cpu + ", " +
                ram + ", " +
                pevnyDisk + ", " +
                druhyDisk;
    }
}
