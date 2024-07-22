package com.example.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ams.entity.Contact;

public interface contactRepository extends JpaRepository<Contact, Long> {
	
}
