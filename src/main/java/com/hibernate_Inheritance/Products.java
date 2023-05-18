package com.hibernate_Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("Products")
public class Products {
	@Id
	private int productId;
	private String productName;
	private String productPrice;

}
