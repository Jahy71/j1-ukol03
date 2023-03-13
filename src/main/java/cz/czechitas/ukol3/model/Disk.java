package cz.czechitas.ukol3.model;

public class Disk {

    private Long kapacita;

    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }


    @Override
    public String toString() {
        return "kapacita disku: " + kapacita + " B" +
                ", vyuzite misto na disku: " + vyuziteMisto + " B";
    }
}
