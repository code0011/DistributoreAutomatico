public class Prodotto { 

	private String nomeProdotto; 
	private float prezzoProdotto;
	private int quantita;


	public Prodotto (String nomeProdotto, float prezzoProdotto, int quantita) {

		this.nomeProdotto = nomeProdotto;
		this.prezzoProdotto = prezzoProdotto;
		this. quantita = quantita;
	} 


	public String getNomeProdotto () {

		return nomeProdotto;
	}


	public void setNomeProdotto (String nomeProdotto) {

		this.nomeProdotto = nomeProdotto;
	}


	public float getPrezzoProdotto () {

		return prezzoProdotto;
	}


	public void setPrezzoProdotto (float prezzoProdotto) {

		this.prezzoProdotto = prezzoProdotto;
	}


	public int getQuantita () {

		return quantita;
	}


	public void setQuantita (int quantita) {

		this.quantita = quantita;
	}



	public void eroga (int quantita) {

		if (getQuantita() >= quantita) {
		
			setQuantita(getQuantita() - quantita);
			System.out.println ("Prodotto erogato: " + getNomeProdotto() + " dal prezzo " + getPrezzoProdotto() + " quantita aggiornata "  + getQuantita ());
		}
		else 
			System.out.println ("Quantita non sufficiente.  Quantita richiesta " + quantita + " rimanenza " + getQuantita ());

	}			 


} 