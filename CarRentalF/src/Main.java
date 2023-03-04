
public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		/*
		 * System.out.println(c.getAnFabricatie()); System.out.println(c.getMarca());
		 * System.out.println(c.getModel()); System.out.println(c.getNrInmatriculare());
		 * System.out.println(c.getPretZi()); System.out.println(c.getFueltype());
		 */

		Car c1 = new Car("ABC 123", "Civic", "Honda", 2020, 75.5f, FuelType.Petrol);
		Car c2 = (Car) c1.clone();
		/*
		 * System.out.println(c2.getAnFabricatie()); System.out.println(c2.getMarca());
		 * System.out.println(c2.getModel());
		 * System.out.println(c2.getNrInmatriculare());
		 * System.out.println(c2.getPretZi()); System.out.println(c2.getFueltype());
		 */

		Client cl = new Client();
		System.out.println(cl.getCnp());
		System.out.println(cl.getNrTelefon());
		System.out.println(cl.getNume());
		System.out.println(cl.getClientNou());

		Client cl2 = new Client("radu", "0767893415", "19999999999", false);
		Client cl1 = (Client) cl2.clone();
		System.out.println(cl1.getCnp());
		System.out.println(cl1.getNrTelefon());
		System.out.println(cl1.getNume());
		System.out.println(cl1.getClientNou());

		cl2.setNume("mihai");
		System.out.println(cl1.getNume());
		System.out.println("============");
		 
		Inchiriere in=new Inchiriere();
		System.out.println(in.getCod());
		System.out.println(in.getCost());
		System.out.println(in.getClient());
		System.out.println(in.getMasina());
		System.out.println(in.isReturFaraProbleme());
		
		Inchiriere in2=new Inchiriere("1001",cl1,c1,2,true);
		Inchiriere in1=(Inchiriere)in2.clone();
		System.out.println(in1.getCod());
		System.out.println(in1.getZile());
		System.out.println(in1.getCost());
		System.out.println(in1.getClient());
		System.out.println(in1.getMasina());
		System.out.println(in1.isReturFaraProbleme());
		
	    System.out.println("==============");
	    
	    in1.setCod("299");
	    in1.setZile(3);
	    in1.setClient(cl2);
	    in1.setMasina(c2);
	    in1.setReturFaraProbleme(false);
	    
	    System.out.println(in1.getCod());
		System.out.println(in1.getZile());
		System.out.println(in1.getCost());
		System.out.println(in1.getClient());
		System.out.println(in1.getMasina());
		System.out.println(in1.isReturFaraProbleme());
		
		 System.out.println("==========================");

		Car[] md = new Car[] { c1, c2 };
		Car[] mi = new Car[] { c };
		Client[]vc=new Client[] {cl1,cl2};
		Inchiriere[]vi=new Inchiriere[] {in1,in2};
		
		Client [] vc1=new Client[]{cl};
		Inchiriere []vi1=new Inchiriere[] {in};
		
				
		Sistem s = new Sistem(md,vc,vi);
		s.setClienti(vc1);
		s.setMasini(mi);
		s.setInchirieri(vi1);
	   
		for(int i=0;i<mi.length;i++) 
		System.out.println(s.getMasini()[i]);
		for(int i=0;i<vc1.length;i++) 
		System.out.println(s.getClienti()[i]);
		for(int i=0;i<vi1.length;i++)
			System.out.println(s.getInchirieri()[i]);
		
		/*
		 * s.adaugaMasina(c1); for(int i=0;i<md.length;i++)
		 * System.out.println(s.getMasini()[i]);
		 */
		s.adaugaMasina(c1);
		s.stergeMasina(c);
		for(int i=0;i<md.length;i++) 
			System.out.println(s.getMasini()[i]);
			
		
		 

	}

}
