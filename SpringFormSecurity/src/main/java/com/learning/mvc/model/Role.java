package com.learning.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name="roles")
public class Role implements Serializable{

	private static final long serialVersionUID = 3535154543542931415L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="role", unique=true, nullable=false)
	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
