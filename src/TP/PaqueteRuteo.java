package TP;

public class PaqueteRuteo {
	private Paquete P;
	
	public PaqueteRuteo(Paquete P1) {
		super();
		P = P1;
	}
	
	public Paquete getSubpaquete() {
		return P;
	}
	public PaqueteRuteo CrearPaqueteRuteo(Paquete P, IP IPd) {
		P.IPdest = IPd;
		PaqueteRuteo P1 = new PaqueteRuteo(P);
		return P1;
	}
}
