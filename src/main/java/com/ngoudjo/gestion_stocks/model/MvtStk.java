package com.ngoudjo.gestion_stocks.model;

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
@Table(name="mvtstk")
public class MvtStk extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;
}
