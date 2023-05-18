package com.hibernate_Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("Laptop")
public class Laptops extends Products {
	
	private String laptopBrand;
	private String processor;

}
