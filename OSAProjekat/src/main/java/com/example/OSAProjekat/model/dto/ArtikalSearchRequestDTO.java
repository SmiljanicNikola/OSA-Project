package com.example.OSAProjekat.model.dto;

//Model vezan iskljucivo za ElasticSearch
public class ArtikalSearchRequestDTO {
	
	private String id;
	
	private String naziv;
	
	private String opis;
	
	private double cena;
	
	private String putanjaSlike;
	
	private int prodavacId;

	public ArtikalSearchRequestDTO(String id, String naziv, String opis, double cena, String putanjaSlike) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.opis = opis;
		this.cena = cena;
		this.putanjaSlike = putanjaSlike;
	}

	public ArtikalSearchRequestDTO(String naziv, String opis, double cena, String putanjaSlike) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.cena = cena;
		this.putanjaSlike = putanjaSlike;
	}

	public ArtikalSearchRequestDTO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getPutanjaSlike() {
		return putanjaSlike;
	}

	public void setPutanjaSlike(String putanjaSlike) {
		this.putanjaSlike = putanjaSlike;
	}

	public int getProdavacId() {
		return prodavacId;
	}

	public void setProdavacId(int prodavacId) {
		this.prodavacId = prodavacId;
	}

	public ArtikalSearchRequestDTO(String id, String naziv, String opis, double cena, String putanjaSlike,
			int prodavacId) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.opis = opis;
		this.cena = cena;
		this.putanjaSlike = putanjaSlike;
		this.prodavacId = prodavacId;
	}

	public ArtikalSearchRequestDTO(String naziv, String opis, double cena, String putanjaSlike, int prodavacId) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.cena = cena;
		this.putanjaSlike = putanjaSlike;
		this.prodavacId = prodavacId;
	}
	
	
}
