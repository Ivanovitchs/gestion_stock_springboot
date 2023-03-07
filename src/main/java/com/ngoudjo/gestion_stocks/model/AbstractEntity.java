package com.ngoudjo.gestion_stocks.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
// ecoute la classe et met a jours automatiquements les valeurs de cette classe dans la bd
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

	// indique que le champs membre ci-dessous est la cle primaire
	@Id
	@GeneratedValue
	// indique que la cle primaire est genere de facon automatique
	private Integer id;
	
	@CreatedDate
// nous nommons un nom
	@Column(name="creationDate", nullable=false)
	private Instant creationDate;
	
	
	
	@LastModifiedDate
	@Column(name="lastmodifieddate", nullable=false)
// pas besoin de ces attributs lorsque j'appelle mon API	
	@JsonIgnore
	private Instant lastuptdateDate;
}
