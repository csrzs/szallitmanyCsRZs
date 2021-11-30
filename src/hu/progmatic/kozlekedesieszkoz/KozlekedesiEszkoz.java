package hu.progmatic.kozlekedesieszkoz;

public abstract class KozlekedesiEszkoz {
  private final String nyilvantartasiSzam;
  private double sebesseg;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public KozlekedesiEszkoz(String nyilvantartasiSzam) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
  }

  public KozlekedesiEszkoz(String nyilvantartasiSzam, double sebesseg) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
    this.sebesseg = sebesseg;
  }

  // GETTEREK, SETTEREK ---------------------------------------------------------------------------

  public String getNyilvantartasiSzam() {
    return nyilvantartasiSzam;
  }

  public double getSebesseg() {
    return sebesseg;
  }

  public void setSebesseg(double sebesseg) {
    this.sebesseg = sebesseg;
  }

  public abstract String getTipus();

  public abstract double getSzallitasiIdo(double tavolsag);

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public final String toString() {
    return "Típus: " + getTipus() + "\n"
            + "Nyilvántartási szám: [" + nyilvantartasiSzam + "]" + "\n"
            + "Sebesség: " + sebesseg + " km/h";
  }
}
