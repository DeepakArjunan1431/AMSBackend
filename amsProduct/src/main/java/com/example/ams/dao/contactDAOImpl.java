package com.example.ams.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ams.entity.Contact;
import com.example.ams.mapper.contactModelMapper;
import com.example.ams.model.ContactModelwithId;
import com.example.ams.model.ResponseModel;
import com.example.ams.repository.contactRepository;

@Repository
public class contactDAOImpl implements contactDAO {
	@Autowired
	contactRepository cr;
	
	@Autowired
	contactModelMapper cmm;
	
	@Override
	public List<Contact> getAllDetails(){
		return cr.findAll();
	}
	
	@Override
	public Optional<Contact> getDetailsById(Long id){
		return cr.findById(id);
	}
	
	@Override
	public ResponseModel createDetails(Contact c) {
		ResponseModel rs;
		if(cr.save(c) != null) {
			rs = new ResponseModel(true, "Created Successfully");
		} else {
			rs = new ResponseModel(false, "Creation Unsuccessful");
		}
		return rs;
	}
	
	@Override
	public ResponseModel SaveDetails(Contact contact) {
		ResponseModel responsemodel;
		if(cr.save(contact)!=null) {
			responsemodel = new ResponseModel(true, "Saved the Details Successfully");
		} else {
			responsemodel =  new ResponseModel(false, "Couldnt Save the Details");
		}
		return responsemodel;
	}
	
	@Override
	public ResponseModel updateDetails(ContactModelwithId cmwithid) {
		ResponseModel rscm;
		
		Contact cm = cr.getReferenceById(cmwithid.getId());
		cm.setName(cmwithid.getName());
		cm.setNum(cmwithid.getNum());
		cm.setMailId(cmwithid.getMailId());
		cm.setAddress(cmwithid.getAddress());
		cm.setDateOfJoining(cmwithid.getDateOfJoining());
		cm.setEndSubcription(cmwithid.getEndSubcription());
		cm.setActiveStatus(cmwithid.getActiveStatus());
		
		if(cr.save(cm) != null) {
			rscm = new ResponseModel(true, "Updated Successfully");
		} else {
			rscm = new ResponseModel(false, "Error while Updating");
		}
		return rscm;
	}
	
	@Override
	public ResponseModel deleteDetails(Long id) {
		try {
			Contact c = cr.getReferenceById(id);
			c.setIsDeleted(true);
			cr.save(c);
			return new ResponseModel(true,"Contact"+c.getName()+"Deleted Successfully");
		} catch (Exception e){
			return new ResponseModel(false,"Error While Deleting");
		}
	}

}
