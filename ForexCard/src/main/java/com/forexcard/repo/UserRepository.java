package com.forexcard.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forexcard.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
    Optional<User> findByEmail(String email);
<<<<<<< HEAD
    Optional<User> findByName(String name); // To get the name to card application form.

=======
	boolean existsByEmail(String email);
	String getUserByEmail(String email);
>>>>>>> 0efe502 (Added 4 entities)

}
