package org.hrd.kotlin.kotlin.services;

import org.hrd.kotlin.kotlin.models.User;

public interface UserService {

	public User findByUserName(String name);
	public boolean createUser(User user);
	public boolean editUser(User user);
	public boolean removeUser(int id);
	public User findByUserEmail(String email);
	public User findByUserPassword(String password);
}
