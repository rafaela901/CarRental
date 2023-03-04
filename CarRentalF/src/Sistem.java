

public class Sistem{
	private Car[] masini;
	private Client[] clienti;
	private Inchiriere[] inchirieri;
	
	
	public Sistem()
	{
	this.masini=new Car[this.masini.length];
	masini[0]=null;
	this.clienti=new Client[this.clienti.length];
	clienti[0]=null;
	this.inchirieri=new Inchiriere[this.inchirieri.length];
	inchirieri[0]=null;
	
	}
	
	
	public Sistem(Car[] masini, Client[] clienti, Inchiriere[] inchirieri) {
		this.masini =new Car[masini.length];
		for(int i=0;i<masini.length;i++)
			this.masini[i]=masini[i];
		this.clienti =new Client[clienti.length];
		for(int i=0;i<clienti.length;i++)
			this.clienti[i]=clienti[i];
		this.inchirieri =new Inchiriere[inchirieri.length];
		for(int i=0;i<inchirieri.length;i++)
			this.inchirieri[i]=inchirieri[i];
		
	}



	@Override
	public Object clone() {
		Sistem copy=new Sistem();
		copy.masini =new Car[masini.length];
		for(int i=0;i<masini.length;i++)
			copy.masini[i]=masini[i];
		copy.clienti =new Client[clienti.length];
		for(int i=0;i<clienti.length;i++)
			copy.clienti[i]=clienti[i];
		copy.inchirieri =new Inchiriere[inchirieri.length];
		for(int i=0;i<inchirieri.length;i++)
			copy.inchirieri[i]=inchirieri[i];
		return copy;
		
	}
	
	

	public Car[] getMasini() {
		
		return masini;
	}
	
	public void setMasini(Car[] masini) {
		this.masini=new Car[masini.length];
		for(int i=0;i<masini.length;i++)
			this.masini[i]=masini[i];
	}
	public Client[] getClienti() {
		return clienti;
	}
public void setClienti(Client[] clienti) {
		this.clienti=new Client[clienti.length];
		for(int i=0;i<clienti.length;i++)
			this.clienti[i]=clienti[i];
	}
public Inchiriere[] getInchirieri()
{
	return inchirieri;
}
public void setInchirieri(Inchiriere[] inchirieri)
{
	this.inchirieri=new Inchiriere[inchirieri.length];
	for(int i=0;i<inchirieri.length;i++)
		this.inchirieri[i]=inchirieri[i];
}

public void adaugaMasina(Car masina)
{ 
	Car []copy=new Car[this.masini.length];
	for(int i=0;i<masini.length;i++)
		copy[i]=masini[i];
	this.masini=new Car[masini.length+1];
	int n=masini.length;
	for(int i=0;i<copy.length;i++)
		masini[i]=copy[i];
	masini[n-1]=masina;
	
}

public void stergeMasina(Car masina)
{
	Car []copy=new Car[this.masini.length];
	int j=0;
	for(int i=0;i<masini.length;i++)
	{	if(masini[i]!=masina)
			{copy[j]=masini[i];
			j++;}}
	this.masini=copy;
	
	
}

public void adaugClient(Client client)
{
	Client []copy=new Client[this.clienti.length];
	for(int i=0;i<clienti.length;i++)
		copy[i]=clienti[i];
	this.clienti=new Client[clienti.length+1];
	int n=clienti.length;
	for(int i=0;i<copy.length;i++)
		clienti[i]=copy[i];
	clienti[n-1]=client;
}
	
public void adaugInchiriere(Inchiriere inchiriere)
{
	Inchiriere []copy=new Inchiriere[this.inchirieri.length];
	for(int i=0;i<inchirieri.length;i++)
		copy[i]=inchirieri[i];
	this.inchirieri=new Inchiriere[inchirieri.length+1];
	int n=inchirieri.length;
	for(int i=0;i<copy.length;i++)
		inchirieri[i]=copy[i];
	inchirieri[n-1]=inchiriere;
}
	
}


