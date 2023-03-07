package com.ngoudjo.gestion_stocks.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "datecommande")
	private Instant datecommande;
	
	@ManyToOne
	@JoinColumn(name="idfournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "commandefournisseur")
	private List<LigneCommandeFournisseur> lignecommandefournisseur;
}
