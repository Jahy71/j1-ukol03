package cz.czechitas.ukol3.model;

public class DruhyDisk {

    private Long kapacita;

    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public Long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "kapacita druheho disku: " + kapacita + " B, " +
                "vyuzite misto druheho disku: " + vyuziteMisto + " B, ";
    }
}

