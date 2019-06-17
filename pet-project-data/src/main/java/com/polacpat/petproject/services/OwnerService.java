package com.polacpat.petproject.services;

import com.polacpat.petproject.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findbyId(Long id);

    Owner findbyLastName(String lastNamed);

    Owner save(Owner owner);

    Set<Owner> findAll();


}
