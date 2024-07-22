package com.example.ams.dao;

import java.util.List;
import java.util.Optional;

import com.example.ams.entity.Contact;
import com.example.ams.model.ContactModelwithId;
import com.example.ams.model.ResponseModel;

public interface contactDAO {

	List<Contact> getAllDetails();

	Optional<Contact> getDetailsById(Long id);

	ResponseModel createDetails(Contact c);

	ResponseModel updateDetails(ContactModelwithId cmwithid);

	ResponseModel deleteDetails(Long id);

	ResponseModel SaveDetails(Contact contact);
	
}
