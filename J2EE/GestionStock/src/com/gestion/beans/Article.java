package com.gestion.beans;

public class Article {
	
	//ATTRIBUTS
	protected String nom;
	protected int codeBarre;
	protected int quantité ;
	protected int seuil;
	protected int prix;
	protected int prixEtat;
	
	//Constructor
	public Article(String nom, int codeBarre, int quantité, int seuil, int prix, int prixEtat) {
		super();
		this.nom = nom;
		this.codeBarre = codeBarre;
		this.quantité = quantité;
		this.seuil = seuil;
		this.prix = prix;
		this.prixEtat = prixEtat;
	}

	//METHODES 
	
	
	//Getters 
	
	public String getNom() {
		return nom;
	}
	
	
	public int getCodeBarre() {
		return codeBarre;
	}
	
	public int getQuantité() {
		return quantité;
	}

	public int getSeuil() {
		return seuil;
	}
	
	public int getPrix() {
		return prix;
	}
	

	public int getPrixEtat() {
		return prixEtat;
	}



	//Setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}



	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
	}



	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	

	public void setSeuil(int seuil) {
		this.seuil = seuil;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}


	public void setPrixEtat(int prixEtat) {
		this.prixEtat = prixEtat;
	}
	
	
	

}
