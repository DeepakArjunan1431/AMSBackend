package com.example.ams.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.dao.contactDAO;
import com.example.ams.entity.Contact;
import com.example.ams.mapper.contactModelMapper;
import com.example.ams.model.ContactModelwithId;
import com.example.ams.model.ResponseModel;
import com.example.ams.model.contactModel;

@Service	
public class contactOperationServiceImpl implements contactOperationService{
	@Autowired
	public contactDAO contactdao;
	
	@Autowired
	public contactModelMapper contmodelmapper;
	
	@Override
	public List<Contact> getAllDetails(){
		return contactdao.getAllDetails();
	}
	
	@Override
	public Optional<Contact> getAllDetailsById(Long id){
		return contactdao.getDetailsById(id);
	}
	
	@Override
	public ResponseModel saveAllDetails(contactModel contactmodel) {
		
		Contact contact = contmodelmapper.ContactModeltoEntity(contactmodel);
		
		return contactdao.SaveDetails(contact);
	}
	
	@Override
	public ResponseModel updateDetailsModel(ContactModelwithId contactmodelwithid) {
		return contactdao.updateDetails(contactmodelwithid);
	}
	
	@Override
	public ResponseModel deleteDetails(long id) {
		return contactdao.deleteDetails(id);
	}
	
	@Override 
	public ResponseModel createDetails(contactModel contactmodel) {
		Contact contact = contmodelmapper.ContactModeltoEntity(contactmodel);
		return contactdao.createDetails(contact);
	}
	
}