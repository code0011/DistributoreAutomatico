public class VendingMachine {

	private final static float CAPIENZA_MASSIMA_CASSA = 200.0F;

	private final static int SELEZIONE_CAFFE = 11;


	float cassettaMonete; 			
	float creditoInserito; 

	Prodotto caffe = new Bevanda ("caffe", 0.5F, 10, 0);
	Prodotto cioccolata = new Bevanda ("cioccolata", 0.8F, 20, 0);
	Prodotto mars = new Snack ("mars", 1F, 5);
	Prodotto twix = new Snack ("twix", 1.5F, 7);


	
	public float getCassettaMonete () {

		return cassettaMonete;
	}


	public void setCassettaMonete (float cassettaMonete) {

		this.cassettaMonete = cassettaMonete;
	}


	public float getCreditoInserito () {

		return creditoInserito;
	}


	public void setCreditoInserito (float creditoInserito) {

		this.creditoInserito = creditoInserito;
	}



	public void riceviCredito (float creditoInserito) {

		if ((getCreditoInserito() + getCassettaMonete()) <= CAPIENZA_MASSIMA_CASSA) 		
		

				setCreditoInserito(creditoInserito);

		else
			System.out.println ("troppi soldi");

	}


		
	public void selezionaProdotto (int prodottoSelezionato, int quantita) {
		

		//11, 12 o 33 vengono inseriti nel main

		if (prodottoSelezionato == SELEZIONE_CAFFE) {

			if (getCreditoInserito () >= caffe.getPrezzoProdotto ())

				caffe.eroga(quantita);

			else
			
				System.out.println ("credito insufficiente");	

		
		} 

		else if (prodottoSelezionato == 12) {

		if (getCreditoInserito () >= cioccolata.getPrezzoProdotto ()) 
				
			cioccolata.eroga(quantita);

		else
			
			System.out.println ("credito insufficiente");		
		}

		else if (prodottoSelezionato == 21) { 

			if (getCreditoInserito () >= mars.getPrezzoProdotto ()) 
				
				mars.eroga(quantita);

			else
			
			System.out.println ("credito insufficiente");	
		} 


		else if (prodottoSelezionato == 22) {

		if (getCreditoInserito () >= twix.getPrezzoProdotto ())  
				
				twix.eroga (quantita);

			else
			
			System.out.println ("credito insufficiente");	

		} 
				
	

} 


public void erogaProdotto(float credito, int quantita, int codice ) { 

	riceviCredito (credito);
	selezionaProdotto(codice, quantita);



		


} 



	public static void main(String[] args) { 

			VendingMachine vendingMachine1 = new VendingMachine(); 

			vendingMachine1.erogaProdotto(0.5F, 2, 11);
			vendingMachine1.erogaProdotto(0.5F, 9, 11);    
			vendingMachine1.erogaProdotto(1F, 1, 21);    
			vendingMachine1.erogaProdotto(1F, 1, 22);    
			
		
	} 

}

