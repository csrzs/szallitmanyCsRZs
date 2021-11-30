package hu.progmatic.aru;

import hu.progmatic.tomeg.VanTomege;

import java.util.Objects;

public class Aru implements VanTomege {
  private final String nev;
  private final Halmazallapot halmazallapot;
  private double mennyiseg;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public Aru(String nev, Halmazallapot halmazallapot) {
    this.nev = nev;
    this.halmazallapot = halmazallapot;
  }

  public Aru(String nev, Halmazallapot halmazallapot, double mennyiseg) {
    this.nev = nev;
    this.halmazallapot = halmazallapot;
    this.mennyiseg = mennyiseg;
  }

  // GETTEREK, SETTEREK ---------------------------------------------------------------------------


  public String getNev() {
    return nev;
  }

  public Halmazallapot getHalmazallapot() {
    return halmazallapot;
  }

  public double getMennyiseg() {
    return mennyiseg;
  }

  public void setMennyiseg(double mennyiseg) {
    this.mennyiseg = mennyiseg;
  }

  // OVERRIDEOK ------------------------------------------------------------------------------------

  @Override
  public String toString() {
    switch (getHalmazallapot()) {
      case GAZ, SZILARD -> {
        return "ÁRU [" + mennyiseg + " kg " + nev + "]" + "\n";
      }
      default -> {
        return "ÁRU [" + mennyiseg + " l " + nev + "]" + "\n";
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Aru)) return false;
    Aru aru = (Aru) o;
    return nev.equals(aru.nev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nev);
  }

  @Override
  public double getTomeg() {
    return mennyiseg;
  }
}
