package controller;

public class Fournisseur {
	
	protected String nom;
	protected String adresse;
	protected String codePostal;
	protected int numeroTelephone;
	
	//CONSTRUCTOR 
	public Fournisseur(String nom, String adresse, String codePostal, int numeroTelephone){
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.numeroTelephone = numeroTelephone;
	}
	
	//GETTERS ET SETTERS 


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public int getNumeroTelephone() {
		return numeroTelephone;
	}


	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	
	
	//METHODES 
	
	public void renvoyerCommande(Article article,Detaillant detaillant) {
		System.out.println("Code Barre : " +article.codeBarre);
		System.out.println("Quantité : " +article.quantité);
		System.out.println("Destinataire : " +detaillant.nom);
		System.out.println("Adresse : " +detaillant.adresseMagasin);

	}
	
	public void updateStock(Article a,Detaillant d) {
		d.ListeArticle.add(a);
	}
	
	
	
	

}
