package com.example.ams.controller;

import java.awt.print.Pageable; 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ams.entity.Contact;
import com.example.ams.model.ContactModelwithId;
import com.example.ams.model.ResponseModel;
import com.example.ams.model.contactModel;
import com.example.ams.service.contactOperationService;

@RestController
@RequestMapping("/api-v1")
public class contactController {
	
	@GetMapping("/sample")
	public String sample() {
		return "Sample";            
	}
	
}














