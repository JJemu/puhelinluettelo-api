package com.puhelinluettelo_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhonebookEntryRepository extends JpaRepository<PhonebookEntry, Long> {
}
