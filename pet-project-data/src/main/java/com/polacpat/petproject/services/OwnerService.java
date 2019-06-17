package com.polacpat.petproject.services;

import com.polacpat.petproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {


    Owner findbyLastName(String lastNamed);


}
