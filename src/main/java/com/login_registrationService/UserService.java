package com.login_registrationService;

import com.login_registrationModel.User;
import com.login_registrationServicewebdto.UserRegistartionDto;

public interface UserService {
	
	User save(UserRegistartionDto registrationDto);

}
