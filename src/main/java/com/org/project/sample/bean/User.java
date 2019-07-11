package com.org.project.sample.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Generic bean to represent a User in the system
 * 
 * @author Sriram
 *
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	



}
