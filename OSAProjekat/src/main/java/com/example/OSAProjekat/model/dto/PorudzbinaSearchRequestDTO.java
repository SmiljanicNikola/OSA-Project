package com.example.OSAProjekat.model.dto;

import java.time.LocalDate;

import com.example.OSAProjekat.model.entity.Kupac;

public class PorudzbinaSearchRequestDTO {
	
	private String id;

	private LocalDate satnica;
	
	private boolean dostavljeno;
	
	private int ocena;
	
	private String komentar;
	
	private boolean anonimanKomentar;
	
	private boolean arhiviranKomentar;
	
	private int kupacId;
	
	private int stavkaId;	
	

	public int getKupacId() {
		return kupacId;
	}


	public void setKupacId(int kupacId) {
		this.kupacId = kupacId;
	}


	public int getStavkaId() {
		return stavkaId;
	}


	public void setStavkaId(int stavkaId) {
		this.stavkaId = stavkaId;
	}


	public LocalDate getSatnica() {
		return satnica;
	}


	public void setSatnica(LocalDate satnica) {
		this.satnica = satnica;
	}


	public boolean isDostavljeno() {
		return dostavljeno;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDostavljeno(boolean dostavljeno) {
		this.dostavljeno = dostavljeno;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getKomentar() {
		return komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	public boolean isAnonimanKomentar() {
		return anonimanKomentar;
	}

	public void setAnonimanKomentar(boolean anonimanKomentar) {
		this.anonimanKomentar = anonimanKomentar;
	}

	public boolean isArhiviranKomentar() {
		return arhiviranKomentar;
	}

	public void setArhiviranKomentar(boolean arhiviranKomentar) {
		this.arhiviranKomentar = arhiviranKomentar;
	}

	public PorudzbinaSearchRequestDTO() {
		super();
	}


	public PorudzbinaSearchRequestDTO(String id, LocalDate satnica, boolean dostavljeno, int ocena, String komentar,
			boolean anonimanKomentar, boolean arhiviranKomentar) {
		super();
		this.id = id;
		this.satnica = satnica;
		this.dostavljeno = dostavljeno;
		this.ocena = ocena;
		this.komentar = komentar;
		this.anonimanKomentar = anonimanKomentar;
		this.arhiviranKomentar = arhiviranKomentar;
	}


	public PorudzbinaSearchRequestDTO(LocalDate satnica, boolean dostavljeno, int ocena, String komentar,
			boolean anonimanKomentar, boolean arhiviranKomentar) {
		super();
		this.satnica = satnica;
		this.dostavljeno = dostavljeno;
		this.ocena = ocena;
		this.komentar = komentar;
		this.anonimanKomentar = anonimanKomentar;
		this.arhiviranKomentar = arhiviranKomentar;
	}


	public PorudzbinaSearchRequestDTO(String id, LocalDate satnica, boolean dostavljeno, int ocena, String komentar,
			boolean anonimanKomentar, boolean arhiviranKomentar, int kupacId, int stavkaId) {
		super();
		this.id = id;
		this.satnica = satnica;
		this.dostavljeno = dostavljeno;
		this.ocena = ocena;
		this.komentar = komentar;
		this.anonimanKomentar = anonimanKomentar;
		this.arhiviranKomentar = arhiviranKomentar;
		this.kupacId = kupacId;
		this.stavkaId = stavkaId;
	}


	public PorudzbinaSearchRequestDTO(LocalDate satnica, boolean dostavljeno, int ocena, String komentar,
			boolean anonimanKomentar, boolean arhiviranKomentar, int kupacId, int stavkaId) {
		super();
		this.satnica = satnica;
		this.dostavljeno = dostavljeno;
		this.ocena = ocena;
		this.komentar = komentar;
		this.anonimanKomentar = anonimanKomentar;
		this.arhiviranKomentar = arhiviranKomentar;
		this.kupacId = kupacId;
		this.stavkaId = stavkaId;
	}


	public PorudzbinaSearchRequestDTO(String id, LocalDate satnica, boolean dostavljeno, int ocena, String komentar,
			boolean anonimanKomentar, boolean arhiviranKomentar, int kupacId) {
		super();
		this.id = id;
		this.satnica = satnica;
		this.dostavljeno = dostavljeno;
		this.ocena = ocena;
		this.komentar = komentar;
		this.anonimanKomentar = anonimanKomentar;
		this.arhiviranKomentar = arhiviranKomentar;
		this.kupacId = kupacId;
	}



	
	
	
}
