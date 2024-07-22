package com.example.ams.service;

import java.util.List;
import java.util.Optional;

import com.example.ams.entity.Contact;
import com.example.ams.model.ContactModelwithId;
import com.example.ams.model.ResponseModel;
import com.example.ams.model.contactModel;

public interface contactOperationService {

	List<Contact> getAllDetails();

	Optional<Contact> getAllDetailsById(Long id);

	ResponseModel saveAllDetails(contactModel contactmodel);

	ResponseModel updateDetailsModel(ContactModelwithId contactmodelwithid);

	ResponseModel deleteDetails(long id);

	ResponseModel createDetails(contactModel contactmodel);

}
