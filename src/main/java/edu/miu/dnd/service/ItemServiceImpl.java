package edu.miu.dnd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.dnd.domain.Item;
import edu.miu.dnd.repository.ItemRepository;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	ItemRepository itemRepository;
	
	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public Optional<Item> findById(Long id) {
		return itemRepository.findById(id);
	}

	@Override
	public Item updateItem(Item item) {
		return itemRepository.save(item);
	}

}
