package hu.progmatic.kozlekedesieszkoz;

public class Repulo extends KozlekedesiEszkoz {
  private static final String tipus = "REPÜLŐ";
  private static final double ellenorzesiIdo = 0.5;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public Repulo(String nyilvantartasiSzam, double sebesseg) {
    super(nyilvantartasiSzam, sebesseg);
  }

  // GETTEREK, SETTEREK ---------------------------------------------------------------------------

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public String getTipus() {
    return tipus;
  }

  @Override
  public double getSzallitasiIdo(double tavolsag) {
    return tavolsag / getSebesseg() + ellenorzesiIdo;
  }
}
