package com.gestion.beans;

public class User {
	protected String nom;
	protected String password ;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String nom, String password) {
		super();
		this.nom = nom;
		this.password = password;
	}

}
