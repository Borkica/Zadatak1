package MojPaket;

public class Krug implements Figura{
	public double getPoluprecnik() {
		return poluprecnik;
	}

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}
	

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	@Override
	public String toString() {
		return "Krug [poluprecnik=" + poluprecnik + "]";
	}

	private double poluprecnik;

	@Override
	public double getO() {
		double O=poluprecnik*3.14;
		return O;
	}

	@Override
	public double getP() {
		double P=poluprecnik*poluprecnik;
		return P;
	}


}
