package com.polacpat.petproject.services;

import com.polacpat.petproject.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findbyId(Long id);

    Vet findbyLastName(String lastNamed);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
