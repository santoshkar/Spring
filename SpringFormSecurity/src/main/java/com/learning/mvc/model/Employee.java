package com.learning.mvc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author santoshkumarkar
 *
 */
@Entity
@Table(name="emp")
public class Employee implements Serializable{

	private static final long serialVersionUID = -8005262983651494226L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
}
