public class Car {
	public String nrInmatriculare;
	public String model;
	public String marca;
	public int anFabricatie;
	public float pretZi;
	public FuelType fuelType;
	
	public Car()
	{
		nrInmatriculare = "necunoscut";
		model = "necunoscut";
		marca = "necunoscuta";
		anFabricatie = 2000;
		pretZi = 100;
		fuelType=FuelType.Diesel;
	}
	public Car(String nrInmatriculare, String model, String marca, int anFabricatie, float pretZi,FuelType fuelType) {
		
		this.nrInmatriculare = nrInmatriculare;
		this.model = model;
		this.marca = marca;
		this.anFabricatie = anFabricatie;
		this.pretZi = pretZi;
		this.fuelType=fuelType;
	}
	
	
	
	@Override
	public Object clone() {
		Car copy=new Car();
		copy.nrInmatriculare = this.nrInmatriculare;
		copy.model = this.model;
		copy.marca = this.marca;
		copy.anFabricatie = this.anFabricatie;
		copy.pretZi = this.pretZi;
		copy.fuelType=this.fuelType;
		return copy;
		
	}
	
	
	
	@Override
	public String toString() {
		return nrInmatriculare+" "+model + " " + marca 
				+ " " + anFabricatie + "  "+pretZi+" "+fuelType;

	}
	public String getNrInmatriculare() {
		return nrInmatriculare;
	}
	public void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnFabricatie() {
		return anFabricatie;
	}
	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}
	public float getPretZi() {
		return pretZi;
	}
	public void setPretZi(float pretZi) {
		this.pretZi = pretZi;
	}
	public FuelType getFueltype() {
		return fuelType;
	}
	public void setFueltype(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
	
	
	
	

}
