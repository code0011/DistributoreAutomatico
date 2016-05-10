public class Snack extends Prodotto {


	public Snack (String nomeProdotto, float prezzoProdotto, int quantita) {

		super (nomeProdotto, prezzoProdotto, quantita);

	}	
	

	public void eroga(int quantita) {

		System.out.println ("Snack in erogazione") ;
		super.eroga (quantita);
	
		
	}

}