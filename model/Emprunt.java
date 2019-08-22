package com.sarki.micro.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Emprunt")
public class Emprunt extends Operation {
	
	private Long duree;
	private Long tauxEscompte;
	private Long montantMinimum;
	/**
	 * 
	 */
	private static final long serialVersionUID = -697636102164351650L;
	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emprunt(long id, double montant, Date createdAt, Date updatedAt) {
		super(id, montant, createdAt, updatedAt);
		// TODO Auto-generated constructor stub
	}
	public Emprunt(Long duree, Long tauxEscompte) {
		super();
		this.duree = duree;
		this.tauxEscompte = tauxEscompte;
	}
	public Long getDuree() {
		return duree;
	}
	public void setDuree(Long duree) {
		this.duree = duree;
	}
	public Long getTauxEscompte() {
		return tauxEscompte;
	}
	public void setTauxEscompte(Long tauxEscompte) {
		this.tauxEscompte = tauxEscompte;
	}
	public Long getMontantMinimum() {
		return montantMinimum;
	}
	public void setMontantMinimum(Long montantMinimum) {
		this.montantMinimum = montantMinimum;
	}
	
	

}
