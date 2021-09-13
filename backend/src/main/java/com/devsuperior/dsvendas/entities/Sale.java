package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Double amoute;
	private LocalDate date;

	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	
	
	public Sale() {
		
	}



	public Sale(Long id, Integer visited, Double amoute, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.amoute = amoute;
		this.date = date;
		this.seller = seller;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getVisited() {
		return visited;
	}



	public void setVisited(Integer visited) {
		this.visited = visited;
	}



	public Double getAmoute() {
		return amoute;
	}



	public void setAmoute(Double amoute) {
		this.amoute = amoute;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public Seller getSeller() {
		return seller;
	}



	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
}
