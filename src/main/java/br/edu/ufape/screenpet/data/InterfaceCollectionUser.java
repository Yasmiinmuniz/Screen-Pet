package br.edu.ufape.screenpet.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.screenpet.business.basic.User;

@Repository
public interface InterfaceCollectionUser extends JpaRepository<User, Long> {
	User findByEmail(String email);
}