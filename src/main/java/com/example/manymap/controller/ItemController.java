package com.example.manymap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.manymap.model.Item;
import com.example.manymap.repository.ItemRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class ItemController {
	
	@Autowired
	ItemRepository itemRepo;
	
	@PostMapping("item")
	public Item createItem(@Valid @RequestBody Item item) {
		return this.itemRepo.save(item);
	}
	
	@GetMapping("item")
	public Iterable<Item> getAllItems(){
		return this.itemRepo.findAll();
	}
	
	/*
	 * @RequestMapping(value="/notes", method=RequestMethod.POST)
	public Note createNote(@Valid @RequestBody Note note) {
		//System.out.println(note.toString());
		return noteRepository.save(note);
	}*/


}
