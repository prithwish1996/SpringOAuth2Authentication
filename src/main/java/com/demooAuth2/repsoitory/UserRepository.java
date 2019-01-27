package com.demooAuth2.repsoitory;



import org.springframework.data.jpa.repository.JpaRepository;

import com.demooAuth2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
