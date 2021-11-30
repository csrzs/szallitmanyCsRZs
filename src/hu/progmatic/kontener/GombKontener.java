package hu.progmatic.kontener;

public final class GombKontener extends Kontener {
  private final double sugar;

  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public GombKontener(int arufelek, double sugar) {
    super(arufelek);
    this.sugar = sugar;
  }

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public double getKapacitas() {
    return (4 / 3) * sugar * Math.PI;
  }
}
