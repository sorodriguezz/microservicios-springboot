package com.wannacode.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
	@Id
	private String id;
	private String productName;
	private String productDescription;
	private Double unitPrice;
}
