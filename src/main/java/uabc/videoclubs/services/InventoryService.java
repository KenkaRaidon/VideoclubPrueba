package uabc.videoclubs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.videoclubs.entities.Inventory;
import uabc.videoclubs.repository.InventoryRepository;

@Service
public class InventoryService implements IInventoryService {

	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public Inventory findByInventoryId(Integer inventoryId) {
		return inventoryRepository.findByInventoryId(inventoryId);
	}

}
