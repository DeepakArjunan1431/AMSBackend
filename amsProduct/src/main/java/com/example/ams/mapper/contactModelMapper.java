package com.example.ams.mapper;


import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.ams.entity.Contact;
import com.example.ams.model.contactModel;

@Service
public class contactModelMapper {
	
	public Contact ContactModeltoEntity(contactModel cm) {
		Date d = new Date();
		Timestamp t = new Timestamp(d.getTime());
		System.out.println("This is the model Mapper");
		Contact cc = new Contact(
				null,
				cm.getName(),
				cm.getNum(),
				cm.getMailId(),
				cm.getAddress(),
				cm.getDateOfJoining(),
				cm.getEndSubcription(),
				t,
				t,
				false, null
				);
		return cc;
	}
	
}
