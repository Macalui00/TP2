package TP;

public abstract class Paquete {
	protected IP ipDest;
	protected IP ipOrig;

	protected int ttl;


	/*public Paquete(IP ipd, IP ipo, int ttl) {
		IPdest = ipd;
		IPorig = ipo;
		TTL = ttl;
	}*/
	
	public IP getIpDest() {
		return ipDest;
	}
	public void setIpDest(IP ipDest) {
		this.ipDest = ipDest;
	}
	public IP getIpOrig() {
		return ipOrig;
	}
	public void setIpOrig(IP ipOrig) {
		this.ipOrig = ipOrig;
	}
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	
	
	public boolean esDeServicio() {
		
	}
	public abstract Paquete getSubpaquete();
}
