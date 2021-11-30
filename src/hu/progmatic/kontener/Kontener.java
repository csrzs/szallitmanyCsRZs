package hu.progmatic.kontener;

import hu.progmatic.aru.Aru;
import hu.progmatic.tomeg.VanTomege;

import java.util.Arrays;

public abstract class Kontener implements VanTomege {
  private int arufelek;
  private final Aru[] kontener;
  private int kontenerTomeg;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public Kontener(int arufelek) {
    this.arufelek = arufelek;
    this.kontener = new Aru[arufelek];
  }

  // GETTEREK, SETTEREK ---------------------------------------------------------------------------

  public int getArukTomege() {
    int output = 0;

    for (Aru elem : kontener) {
      if (elem != null) {
        output += elem.getTomeg();
      }
      continue;
    }
    return output;
  }

  public abstract double getKapacitas();

  public final void hozzaAd(Aru input) {
    if (nincsSzabadHely() || nincsSzabadKapacitas(input.getTomeg())) {
      throw new RuntimeException("Nincs szabad hely, vagy nincs szabad kapacitás!");
    }
    kontener[elsoSzabadHelyIndexe()] = input;
  }

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public double getTomeg() {
    return getArukTomege();
  }

  // EGYÉB METÓDUSOK ------------------------------------------------------------------------------


  @Override
  public String toString() {
    return adatlap();
  }

  public final String adatlap() {
    return "Áruk listája:" + "\n"
            + aruLista()
            + "Konténer tömege: " + getTomeg() + "\n"
            + "Konténer kapacitása: " + getKapacitas() + "\n";
  }

  public final String aruLista() {
    String output = "";

    for (Aru elem : kontener) {
      if (elem != null) {
        output += elem.toString();
      } else {
        output += "null" + "\n";
        continue;
      }
    }
    return output;
  }

  public boolean nincsSzabadHely() {
    return !Arrays.asList(kontener).contains(null);
  }

  public boolean nincsSzabadKapacitas(double inputAruTomege) {
    return getKapacitas() < getArukTomege() + inputAruTomege;
  }

  public int elsoSzabadHelyIndexe() {
    int output = 0;

    for (Aru elem : kontener) {
      if (elem == null) {
        return output;
      } else {
        output++;
        continue;
      }
    }
    return output;
  }

  public boolean vanMarAzonosAru(Aru input) {
    for (Aru elem : kontener) {
      if (elem.equals(input)) {
        return true;
      } else {
        continue;
      }
    }
    return false;
  }
}