public class Client {
	public String nume;
	public String nrTelefon;
	public String cnp;
	boolean clientNou;
	
	public Client() {
		nume="anonim";
		nrTelefon="necunoscut";
		cnp="necunoscut";
		clientNou=true;
	}
	public Client(String nume, String nrTelefon, String cnp, boolean clientNou) {
	
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.cnp = cnp;
		this.clientNou = clientNou;
	}
	
	@Override
	public Object clone() {
		Client copy=new Client();
		copy.nume = this.nume;
		copy.nrTelefon = this.nrTelefon;
		copy.cnp = this.cnp;
		copy.clientNou = this.clientNou;
		
		return copy;
		
	}
	
	@Override
	public String toString() {
		return this.nume+" "+this.nrTelefon+" "+
	this.cnp+" "+this.clientNou;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	public boolean getClientNou() {
		return clientNou;
	}
	public void setClientNou(boolean clientNou) {
		this.clientNou = clientNou;
	}
	
	
	
	

}
