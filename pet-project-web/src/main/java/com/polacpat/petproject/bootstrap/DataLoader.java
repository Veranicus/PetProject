package com.polacpat.petproject.bootstrap;

import com.polacpat.petproject.model.Owner;
import com.polacpat.petproject.model.Vet;
import com.polacpat.petproject.services.OwnerService;
import com.polacpat.petproject.services.VetService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Franklin");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mike");
        owner2.setLastName("Morhaim");

        ownerService.save(owner2);

        System.out.println("loaded owners");

        Vet vet = new Vet();
        vet.setId(3L);
        vet.setFirstName("Mohman");
        vet.setLastName("Kaldrok");

        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setId(3L);
        vet2.setFirstName("Joanna");
        vet2.setLastName("Kahnemann");

        vetService.save(vet2);

        System.out.println("Loaded vets");


    }
}
