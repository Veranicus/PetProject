package com.polacpat.petproject.services;

import com.polacpat.petproject.model.Owner;
import com.polacpat.petproject.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Owner findbyLastName(String lastNamed);

}
