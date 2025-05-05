package com.puhelinluettelo_api;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/entries")
public class PhonebookController {

    private final PhonebookEntryRepository repository;

    public PhonebookController(PhonebookEntryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PhonebookEntry> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public PhonebookEntry create(@RequestBody PhonebookEntry entry) {
        return repository.save(entry);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}