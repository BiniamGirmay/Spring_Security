package edu.miu.dnd.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@SecondaryTable(name = "User_Credential")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	@Column(table = "User_Credential")
	private String username;
	
	@Column(table = "User_Credential")
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Role> roles;

	public User(String firstName, String lastName, String username, String password, List<Role> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}	
}
