package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

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
        mujDisk.setVyuziteMisto(311_000_000L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujPocitac);




    }

}
