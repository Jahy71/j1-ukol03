package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.*;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Pocitac mujPocitac;
        mujPocitac = new Pocitac();
        System.out.println(mujPocitac);
        mujPocitac.zapniSe();

        Procesor mujProcesor;
        mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_400_000_000L);
        mujProcesor.setVyrobce("Intel");

        Pamet mojePamet;
        mojePamet = new Pamet();
        mojePamet.setKapacita(8_000_000_000L);

        Disk mujDisk;
        mujDisk = new Disk();
        mujDisk.setKapacita(512_000_000_000L);
        mujDisk.setVyuziteMisto(312_000_000_000L);

        Disk mujDisk2 = new Disk();
        mujDisk2.setKapacita(512_000_000_000L);
        mujDisk2.setVyuziteMisto(0L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);
        mujPocitac.setDruhyDisk(mujDisk2);

        // Vytvoření a yvmazání souboru o určité velikosti:
        mujPocitac.vytvorSouborOVelikostiBezRozdeleniDvaDisky(200_000_000_000L);
        mujPocitac.setVymazSouborOVelikosti(100_000_000_000L);

        System.out.println(mujPocitac);
    }
}
