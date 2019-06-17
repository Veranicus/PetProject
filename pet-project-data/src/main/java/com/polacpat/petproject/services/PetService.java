package com.polacpat.petproject.services;

import com.polacpat.petproject.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyId(Long id);

    Pet findbyName(String lastNamed);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
