package com.kazoo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class User {

	@Id
	private Long id;
	private String username;
	private String email;
	
}
