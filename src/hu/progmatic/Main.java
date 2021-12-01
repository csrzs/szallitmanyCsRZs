package hu.progmatic;

import hu.progmatic.aru.Aru;
import hu.progmatic.aru.Halmazallapot;
import hu.progmatic.kontener.TeglatestKontener;
import hu.progmatic.kozlekedesieszkoz.Repulo;
import hu.progmatic.kozlekedesieszkoz.Vonat;
import hu.progmatic.szallitmany.Szallitmany;

public class Main {

  public static void main(String[] args) {
    Aru alma = new Aru("Alma", Halmazallapot.SZILARD, 1.0);
    Aru viz = new Aru("Víz", Halmazallapot.FOLYADEK, 1.0);
    Aru oxigen = new Aru("Oxigén", Halmazallapot.GAZ, 1.0);
    Aru metan = new Aru("Metán", Halmazallapot.GAZ, 1.0);

    TeglatestKontener kontener1 = new TeglatestKontener(5, 2.0, 2.0, 3.0);
    TeglatestKontener kontener2 = new TeglatestKontener(5, 2.0, 2.0, 3.0);

    Vonat vonat1 = new Vonat("ABC-123", 150);
    Repulo repulo1 = new Repulo("H-123", 150);

    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(metan);

    //kontener2.hozzaAd(alma);
    //kontener2.hozzaAd(viz);
    //kontener2.hozzaAd(oxigen);
    //kontener2.hozzaAd(oxigen);

    Szallitmany szallitmany1 = new Szallitmany(kontener1, vonat1, 300);
    //Szallitmany szallitmany2 = new Szallitmany(kontener2, repulo1, 300);

    System.out.println(szallitmany1.adatlap());
    //System.out.println(szallitmany2.adatlap());

  }
}