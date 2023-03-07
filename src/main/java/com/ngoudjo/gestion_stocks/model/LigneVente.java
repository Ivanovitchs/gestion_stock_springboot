package com.ngoudjo.gestion_stocks.model;

import java.math.BigDecimal;

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
@Table(name="lignevente")
public class LigneVente extends AbstractEntity {

	private BigDecimal quantite;
	
	
	
	@ManyToOne
	@JoinColumn(name="idvente")
	private Ventes ventes;
}
