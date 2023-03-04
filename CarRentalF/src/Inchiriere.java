public class Inchiriere {

 private String cod;
 private Client client;
 private Car masina;
 private int zile;
 private float cost;
 private boolean returFaraProbleme;
 
 public Inchiriere()
 {
	 cod="nu este disponibil";
	 client=null;
	 masina=null;
	 zile=0;
	 cost=0;
	 returFaraProbleme=true; }
 
 public Inchiriere(String cod,Client client,Car masina,int zile,boolean
	 returFaraProbleme) 
 {   this.cod=cod;
     this.client=client;
     this.masina=masina;
     this.zile=zile;
     this.cost=(this.zile)*(masina.getPretZi());
     this.returFaraProbleme=returFaraProbleme;
      
	  }

@Override
public Object clone(){
	Inchiriere copy = new Inchiriere();
	 copy.cod=this.cod;
     copy.client=this.client;
     copy.masina=this.masina;
     copy.zile=this.zile;
     copy.cost=this.cost;
     copy.returFaraProbleme=this.returFaraProbleme;
	return copy;
}



@Override
public String toString() {
	return cod+" \nClientul este: "
			+client+" \nMasina este: "+masina+" "
			+zile+" "+cost+" "+returFaraProbleme;
}

public String getCod() {
	return cod;
}

public void setCod(String cod) {
	this.cod = cod;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Car getMasina() {
	return masina;
}

public void setMasina(Car masina) {
	this.masina = masina;
}
public int getZile()
{
	return zile;
}
public void setZile(int zile)
{
	this.zile=zile;
	
}

public float getCost() {
	if(masina!=null)
	
		return this.getZile()*this.masina.getPretZi();
	else 
		return 0;
	
}


public boolean isReturFaraProbleme() {
	return returFaraProbleme;
}

public void setReturFaraProbleme(boolean returFaraProbleme) {
	this.returFaraProbleme = returFaraProbleme;
}

	
}
