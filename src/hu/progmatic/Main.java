package hu.progmatic;

import hu.progmatic.aru.Aru;
import hu.progmatic.aru.Halmazallapot;
import hu.progmatic.kontener.GombKontener;
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
    Aru korte = new Aru("Körte", Halmazallapot.SZILARD, 1.0);
    Aru oszibarack = new Aru("Őszibarack", Halmazallapot.SZILARD, 1.0);
    Aru co2 = new Aru("Szén-dioxid (CO2)", Halmazallapot.GAZ, 1.0);

    TeglatestKontener kontener1 = setAndFillKontener1(alma, viz, oxigen, metan);
    GombKontener kontener2 = setAndFillKontener2(alma, viz, oxigen, metan, korte, oszibarack, co2);

    Vonat vonat1 = new Vonat("TRAIN-ABC-123", 150);
    Repulo repulo1 = new Repulo("AIRPLANE-HU-789", 1500);

    Szallitmany szallitmany1 = new Szallitmany(kontener1, vonat1, 300);
    Szallitmany szallitmany2 = new Szallitmany(kontener2, repulo1, 1500);

    System.out.println(szallitmany1.adatlap());
    System.out.println(szallitmany2.adatlap());
  }

  private static TeglatestKontener setAndFillKontener1(Aru alma, Aru viz, Aru oxigen, Aru metan) {
    TeglatestKontener kontener1 = new TeglatestKontener(5, 2.0, 2.0, 3.0);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(oxigen);
    kontener1.hozzaAd(viz);
    kontener1.hozzaAd(alma);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(oxigen);
    kontener1.hozzaAd(viz);
    kontener1.hozzaAd(alma);
    kontener1.hozzaAd(metan);
    kontener1.hozzaAd(oxigen);
    kontener1.hozzaAd(viz);
    kontener1.hozzaAd(alma);
    return kontener1;
  }

  private static GombKontener setAndFillKontener2(Aru alma, Aru viz, Aru oxigen, Aru metan, Aru korte, Aru oszibarack, Aru co2) {
    GombKontener kontener2 = new GombKontener(9, 12);
    kontener2.hozzaAd(alma);
    kontener2.hozzaAd(viz);
    kontener2.hozzaAd(oxigen);
    kontener2.hozzaAd(metan);
    kontener2.hozzaAd(oszibarack);
    kontener2.hozzaAd(korte);
    kontener2.hozzaAd(co2);
    kontener2.hozzaAd(co2);
    kontener2.hozzaAd(oxigen);
    return kontener2;
  }
}