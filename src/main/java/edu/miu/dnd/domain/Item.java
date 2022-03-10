package edu.miu.dnd.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Item {
	@Id 
	@GeneratedValue
	private Long id;
	
	private String itemName;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}
}
