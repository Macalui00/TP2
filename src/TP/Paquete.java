package TP;

public abstract class Paquete {
	private IP IPdest;
	private IP IPorig;
	private String tipo;
	private int TTL;
	
	
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

	public Paquete(IP ipd, IP ipo, String t) {
		IPdest = ipd;
		IPorig = ipo;
		tipo = t;
	}
	public boolean esDeServicio() {
		
	}
	public abstract Paquete getSubpaquete();
}
