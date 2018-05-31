package TP;

public class PaqueteRuteo extends Paquete {
	private Paquete p;
	
	public PaqueteRuteo(IP ipOrig, IP ipDest, int ttl,Paquete p1) {
		this.ipOrig = ipOrig;
		this.ipDest = ipDest;
		this.ttl=ttl;
		p = p1;
	}
	
	public Paquete getSubpaquete() {
		return p;
	}
}
