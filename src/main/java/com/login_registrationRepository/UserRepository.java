package com.login_registrationRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login_registrationModel.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	
}
