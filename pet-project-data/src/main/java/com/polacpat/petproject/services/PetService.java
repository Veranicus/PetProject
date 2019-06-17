package com.polacpat.petproject.services;

import com.polacpat.petproject.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    Pet findbyName(String lastNamed);
}
