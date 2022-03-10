package edu.miu.dnd.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Role {
	@Id
	@GeneratedValue
	private Long id;
	
	private String roleName;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Role(String roleName, User user){
		this.roleName = roleName;
		this.user = user;
	}
}
