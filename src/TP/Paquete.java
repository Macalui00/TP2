package TP;

public abstract class Paquete {
	protected IP IPdest;
	protected IP IPorig;
	protected String tipo;
	protected int TTL;
	
	
	public int getTTL() {
		return TTL;
	}

	public void setTTL(int tTL) {
		TTL = tTL;
	}

	public IP getIPdest() {
		return IPdest;
	}

	public void setIPdest(IP iPdest) {
		IPdest = iPdest;
	}

	public IP getIPorig() {
		return IPorig;
	}

	public void setIPorig(IP iPorig) {
		IPorig = iPorig;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Paquete(IP ipd, IP ipo, String t, int ttl) {
		IPdest = ipd;
		IPorig = ipo;
		tipo = t;
		TTL = ttl;
	}
	
	public boolean esDeServicio() {
		
	}
	public abstract Paquete getSubpaquete();
}
