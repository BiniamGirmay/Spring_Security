package edu.miu.dnd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.dnd.domain.Item;
import edu.miu.dnd.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	ItemService itemService;
	
	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping
	public List<Item> findItems(){
		return itemService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Item> findById(@PathVariable Long id){
		return itemService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteItem(@PathVariable Long id){
		return ResponseEntity.ok("Item Deleted Successfuly.");
	}
}
