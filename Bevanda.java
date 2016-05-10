public class Bevanda extends Prodotto {

	int zucchero;


	public Bevanda (String nomeProdotto, float prezzoProdotto, int quantita, int zucchero) {

		super (nomeProdotto, prezzoProdotto, quantita);
		this.zucchero = zucchero;
	}


	public int getZucchero () {

		return zucchero;
	}


	public void setZucchero (int zucchero) {

		this.zucchero = zucchero;
	} 


	public void eroga(int quantita) {

		System.out.println ("Bevanda in erogazione " + "quantita zucchero selezionata: " + getZucchero()) ;

		super.eroga (quantita);						

	} 

}