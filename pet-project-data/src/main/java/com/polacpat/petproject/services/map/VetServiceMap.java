package com.polacpat.petproject.services.map;

import com.polacpat.petproject.model.Owner;
import com.polacpat.petproject.model.Vet;
import com.polacpat.petproject.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findbyLastName(String lastNamed) {
        return findbyLastName(lastNamed);
    }
}
