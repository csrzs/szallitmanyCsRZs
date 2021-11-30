package hu.progmatic.kontener;

public final class TeglatestKontener extends Kontener{
  private final double oldalA;
  private final double oldalB;
  private final double oldalC;


  // KONSTRUKTOROK --------------------------------------------------------------------------------

  public TeglatestKontener(int arufelek, double oldalA, double oldalB, double oldalC) {
    super(arufelek);
    this.oldalA = oldalA;
    this.oldalB = oldalB;
    this.oldalC = oldalC;
  }

  // OVERRIDEOK -----------------------------------------------------------------------------------

  @Override
  public double getKapacitas() {
    return oldalA * oldalB * oldalC;
  }
}
