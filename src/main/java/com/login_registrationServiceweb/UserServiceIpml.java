	package com.login_registrationServiceweb;
	
	import java.util.Arrays;
	
	import javax.imageio.spi.RegisterableService;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.login_registrationModel.Roles;
	import com.login_registrationModel.User;
	import com.login_registrationRepository.UserRepository;
	import com.login_registrationService.UserService;
	import com.login_registrationServicewebdto.UserRegistartionDto;
	@Service
	public class UserServiceIpml  implements UserService{
		
		private UserRepository userRepository;
	public UserServiceIpml(UserRepository userRepository) {
			super();
			this.userRepository = userRepository;
		}
	
	
		
		@Override	
		public User save(UserRegistartionDto registrationDto) 
		{
			
		User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(),registrationDto.getEmail(),
				registrationDto.getPassword(),Arrays.asList(new Roles("ROLE_USER")));
		
	return userRepository.save(user);
	
	}}
