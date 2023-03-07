package com.ngoudjo.gestion_stocks.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="artice")
public class Article extends AbstractEntity {
	
	@Column(name="codeArticle")
	private String codeArticle;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prixunitaireht")
	private BigDecimal prixUnitaireht;
	
	@Column(name="tauxTva")
	private BigDecimal tauxTva;
	
	@Column(name="prixunitairettc")
	private BigDecimal prixunitaireTtc;
	
	@Column(name="photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idcategory")
	private Category category;
	
	}


