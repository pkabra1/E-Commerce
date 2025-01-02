package com.pkabra1.ecommmerce.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(length = 1000)
	private String description;

	@Lob
	@Column(name = "image_data")
	private byte[] imageData;

	@Column(nullable = false)
	private BigDecimal price;

	@Column(nullable = false)
	private Integer stockQuantity;

	@Column
	private String category;

	@Column(name = "image_url")
	private String imageUrl;

	@OneToMany(mappedBy = "product")
	private List<OrderItem> orderItems;

}