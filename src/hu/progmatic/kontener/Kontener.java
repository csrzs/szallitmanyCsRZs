package hu.progmatic.kontener;

import hu.progmatic.aru.Aru;
import hu.progmatic.tomeg.VanTomege;

import java.util.Arrays;

public abstract class Kontener implements VanTomege {
  private final int arufelek;
  private final Aru[] kontener;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public Kontener(int arufelek) {
    this.arufelek = arufelek;
    this.kontener = new Aru[arufelek];
  }

  // GETTEREK, SETTEREK ---------------------------------------------------------------------------

  public double getArukTomege() {
    int output = 0;

    for (Aru elem : kontener) {
      if (elem != null) {
        output += elem.getTomeg();
      }
    }
    return output;
  }

  public abstract double getKapacitas();

  public final void hozzaAd(Aru input) {
    if (nincsSzabadHely() || nincsSzabadKapacitas(input.getTomeg())) {
      throw new RuntimeException("Nincs szabad hely, vagy nincs szabad kapacitás!");
    }
    if (vanMarAzonosAru(input)) {
      kontener[azonosAruIndexe(input)] = new Aru(input.getNev(), input.getHalmazallapot(), input.getMennyiseg() + kontener[azonosAruIndexe(input)].getMennyiseg());
    } else {
      kontener[elsoSzabadHelyIndexe()] = input;
    }
  }

  public double getSzabadKapacitas() {
    return getKapacitas() - getArukTomege();
  }

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public double getTomeg() {
    return getArukTomege();
  }

  @Override
  public String toString() {
    return adatlap();
  }

  // EGYÉB METÓDUSOK ------------------------------------------------------------------------------

  public final String adatlap() {
    return "Áruk listája:" + "\n"
            + aruLista()
            + "Tárolt áruk tömege: " + getTomeg() + "\n"
            + "Konténer max. kapacitása: " + getKapacitas() + "\n"
            + "Konténer szabad kapacitása: " + getSzabadKapacitas() + "\n";
  }

  public final String aruLista() {
    String output = "";

    for (Aru elem : kontener) {
      if (elem != null) {
        output += elem.toString();
      } else {
        output += "null" + "\n";
      }
    }
    return output;
  }

  public boolean nincsSzabadHely() {
    return !Arrays.asList(kontener).contains(null);
  }

  public boolean nincsSzabadKapacitas(double inputAruTomege) {
    return getSzabadKapacitas() < inputAruTomege;
  }

  public int elsoSzabadHelyIndexe() {
    int output = 0;

    for (Aru elem : kontener) {
      if (elem == null) {
        return output;
      } else {
        output++;
      }
    }
    return output;
  }

  public boolean vanMarAzonosAru(Aru input) {
    for (Aru elem : kontener) {
      if (elem != null && elem.equals(input)) {
        return true;
      }
    }
    return false;
  }

  public int azonosAruIndexe(Aru input) {
    int output = 0;
    for (Aru elem : kontener) {
      if (elem == null || !elem.equals(input)) {
        output++;
        continue;
      } else {
        return output;
      }
    }
    throw new RuntimeException("Logikai ellentmondás: (vanMarAzonosAru = true) && (azonoAruIndexe = null)");
  }
}