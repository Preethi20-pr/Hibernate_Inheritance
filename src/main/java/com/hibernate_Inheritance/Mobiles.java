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
@DiscriminatorValue("Mobile")
public class Mobiles extends Products {
	private String mobileModel;
	private String OperatingSystem;

}
