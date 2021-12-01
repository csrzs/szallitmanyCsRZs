package hu.progmatic.szallitmany;

import hu.progmatic.aru.Aru;
import hu.progmatic.kontener.Kontener;
import hu.progmatic.kozlekedesieszkoz.KozlekedesiEszkoz;
import hu.progmatic.tomeg.VanTomege;

public class Szallitmany implements VanTomege {
  private final Kontener szallitmanyKontener;
  private final KozlekedesiEszkoz szallitmanyKozlekedesiEszkoz;
  private final double tavolsag;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public Szallitmany(Kontener szallitmanyKontener, KozlekedesiEszkoz szallitmanyKozlekedesiEszkoz, double tavolsag) {
    this.szallitmanyKontener = szallitmanyKontener;
    this.szallitmanyKozlekedesiEszkoz = szallitmanyKozlekedesiEszkoz;
    this.tavolsag = tavolsag;
  }

  // GETTEREK, SETTEREK ---------------------------------------------------------------------------

  public double getSebesseg() {
    return szallitmanyKozlekedesiEszkoz.getSebesseg();
  }

  public void setSebesseg(double sebesseg) {
    szallitmanyKozlekedesiEszkoz.setSebesseg(sebesseg);
  }

  public double getTavolsag() {
    return tavolsag;
  }

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public double getTomeg() {
    return szallitmanyKontener.getTomeg();
  }

  public double getSzallitasiIdo(double tavolsag) {
    return szallitmanyKozlekedesiEszkoz.getSzallitasiIdo(tavolsag);
  }

// EGYÉB METÓDUSOK ------------------------------------------------------------------------------

  public void hozzaAd(Aru input) {
    szallitmanyKontener.hozzaAd(input);
  }

  public String adatlap() {
    return "========== SZÁLLÍTMÁNY ADATLAPJA ==========" + "\n"
            + "Szállítási idő: " + szallitmanyKozlekedesiEszkoz.getSzallitasiIdo(tavolsag) + " óra" + "\n"
            + "===========================================" + "\n"
            + "\n"
            + "------ KÖZLEKEDÉSI ESZKÖZ ADATLAPJA -------" + "\n"
            + "\n"
            + szallitmanyKozlekedesiEszkoz.toString() + "\n"
            + "\n"
            + "-------------------------------------------" + "\n"
            + "\n"
            + "----------- KONTÉNER ADATLAPJA ------------" + "\n"
            + "\n"
            + szallitmanyKontener.adatlap()
            + "\n"
            + "-------------------------------------------" + "\n"
            + "\n"
            + "===========================================" + "\n"
            + "===========================================" + "\n";
  }
}