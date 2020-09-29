package controller;
import java.util.*;

public class Detaillant {
	
	public String nom;
	public String adresseMagasin ;
	public ArrayList<Article>ListeArticle ;
	public ArrayList<Fournisseur>ListeFournisseur;
	public ArrayList<Article>commande;

	
	//CONSTRUCTOR
	

	public Detaillant(String nom, String adresseMagasin, ArrayList<Article> listeArticle,
			 ArrayList<Fournisseur> listeFournisseur,ArrayList<Article> commande) {
		this.nom = nom;
		this.adresseMagasin = adresseMagasin;
		ListeArticle = listeArticle;
		ListeFournisseur = listeFournisseur;
		this.commande = commande;

	}
	
	//GETTERS 
	
	
	public String getNom() {
		return nom;
	}
	
	
	public String getAdresseMagasin() {
		return adresseMagasin;
	}
	
	
	public ArrayList<Article> getListeArticle() {
		return ListeArticle;
	}
	
	
	
	
	public ArrayList<Fournisseur> getListeFournisseur() {
		return ListeFournisseur;
	}

	public ArrayList<Article> getCommande() {
		return commande;
	}
	
	//SETTERS
	

	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setAdresseMagasin(String adresseMagasin) {
		this.adresseMagasin = adresseMagasin;
	}

	
	public void setListeArticle(ArrayList<Article> listeArticle) {
		ListeArticle = listeArticle;
	}

	
	public void setListeFournisseur(ArrayList<Fournisseur> listeFournisseur) {
		ListeFournisseur = listeFournisseur;
	}
	

	public void setCommande(ArrayList<Article> commande) {
		this.commande = commande;
	}
	
	
	//METHODES 
	
	//SUR LES ARTICLES 
	
	public void ajouterArticle(Article a){
		ListeArticle.add(a);
    }
   
	public void modifierListeArticle(String nom, String nv_nom, int codeBarre, int quantité, int prix,int seuil) {
	   for(Article x : ListeArticle){
           if(x.getNom()==nom){
           	x.setNom(nv_nom);
               x.setPrix(prix);
               x.setQuantité(quantité);
               x.setSeuil(seuil);
           }
	   }
	}
	
	
	public void supprimerArticle(Article a) {
		ListeArticle.remove(a);
	}
   
 
	
	//SUR LES FOURNISSEURS
	
	public void ajouterFournisseur(Fournisseur f) {
		ListeFournisseur.add(f);
	}
	
	public void modifierListeFournisseur(String nom, String nv_nom ,String adresse, String codePostal, int numeroTelephone) {
		for(Fournisseur f : ListeFournisseur) {
			if(nom == f.getNom()) {
				f.setNom(nv_nom);
				f.setAdresse(adresse);
				f.setCodePostal(codePostal);
				f.setNumeroTelephone(numeroTelephone);
			}
		}
	}
	
	public void supprimerFournisseur(Fournisseur f) {
		 ListeFournisseur.remove(f);
		}
	
	
	
	
	//SUR LES COMMANDES 
	
	public void envoyerCommande(Article a , Fournisseur f) {
		commande.add(a);
		System.out.println("Code Barre : " +a.codeBarre);
		System.out.println("Quantité : " +a.quantité);
		System.out.println("Destinataire : " +f.nom);
		System.out.println("Adresse : " +f.adresse);
	}
	
	public void annulerCommande(Article a) {
		commande.remove(a);
	}
	 

}
