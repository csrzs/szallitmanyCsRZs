package hu.progmatic.kozlekedesieszkoz;

public class Vonat extends KozlekedesiEszkoz {
  private static final String tipus = "VONAT";

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public Vonat(String nyilvantartasiSzam, double sebesseg) {
    super(nyilvantartasiSzam, sebesseg);
  }

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public String getTipus() {
    return tipus;
  }

  @Override
  public double getSzallitasiIdo(double tavolsag) {
    return tavolsag / getSebesseg();
  }
}
