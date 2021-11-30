package hu.progmatic;

import hu.progmatic.aru.Aru;
import hu.progmatic.aru.Halmazallapot;
import hu.progmatic.kontener.Kontener;
import hu.progmatic.kontener.TeglatestKontener;
import hu.progmatic.szallitmany.Szallitmany;

public class Main {

  public static void main(String[] args) {
    Aru alma = new Aru("Alma", Halmazallapot.SZILARD,2.0);
    Aru viz = new Aru("Víz", Halmazallapot.FOLYADEK,1.0);
    Aru oxigen = new Aru("Oxigén", Halmazallapot.GAZ,3.0);

    TeglatestKontener kontener1 = new TeglatestKontener(5, 2.0, 2.0, 3.0);

    kontener1.hozzaAd(alma);
    kontener1.hozzaAd(viz);
    kontener1.hozzaAd(oxigen);
    kontener1.hozzaAd(oxigen);
    kontener1.hozzaAd(oxigen);
    System.out.println(kontener1);

  }
}
