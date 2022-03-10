package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import edu.miu.dnd.domain.Item;

public interface ItemService {
	public List<Item> findAll();
	
	public Optional<Item> findById(Long id);
	
	public Item updateItem(Item item);	
}
