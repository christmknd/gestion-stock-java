package controller;

import java.util.*;

public class Client {
	
	protected int numeroCarte;
	public ArrayList<Article>panier;

	public Client(int numeroCarte, ArrayList<Article> panier) {
		this.numeroCarte = numeroCarte;
		this.panier = panier;
	}
	
	
	 public void acheterUnarticle(Article article){
	        panier.add(article);
	    }
	   
	   public void retournerUnarticle(Article article) {
	        panier.remove(article);
	    }
	   
	   
	
	
	

}
