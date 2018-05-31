package TP;

public class PaqueteServicio extends Paquete {
	protected Tipo tipo; //who servicio
	
	
	public PaqueteServicio(IP ipOrig, IP ipDest, int ttl, Tipo tipo) {
		this.ipDest = ipDest;
		this.ipOrig = ipOrig;
		this.ttl = ttl;
		this.tipo = tipo;	
	}
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}
