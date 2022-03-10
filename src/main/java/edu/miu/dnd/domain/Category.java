package edu.miu.dnd.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name")
	private String categroryName;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
	private List<Item> items;
}
