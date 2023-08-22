package br.edu.ufape.screenpet.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.screenpet.business.basic.Pet;
import br.edu.ufape.screenpet.business.basic.User;

@Repository
public interface InterfaceCollectionPet extends JpaRepository<Pet, Long>{
	
	Pet findByName(String name);
}