package com.example.OSAProjekat.model.dto;

//Model vezan iskljucivo za ElasticSearch
public class PorudzbinaKomentarRequestDTO {

	private String komentar;

	public String getKomentar() {
		return komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	public PorudzbinaKomentarRequestDTO(String komentar) {
		super();
		this.komentar = komentar;
	}

	public PorudzbinaKomentarRequestDTO() {
		super();
	}
	
	
}
