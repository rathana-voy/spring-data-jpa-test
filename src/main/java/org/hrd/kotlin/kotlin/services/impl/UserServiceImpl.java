package org.hrd.kotlin.kotlin.services.impl;

import org.hrd.kotlin.kotlin.models.User;
import org.hrd.kotlin.kotlin.repositories.UserRepository;
import org.hrd.kotlin.kotlin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User findByUserName(String name) {

		return userRepo.findByUserName(name);
	}

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		try{
			userRepo.save(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean editUser(User user) {
		return false;
	}

	@Override
	public boolean removeUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByUserEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findByUserEmail(email);
	}

	@Override
	public User findByUserPassword(String password) {
		// TODO Auto-generated method stub
		return userRepo.findByUserPassword(password);
	}

}
