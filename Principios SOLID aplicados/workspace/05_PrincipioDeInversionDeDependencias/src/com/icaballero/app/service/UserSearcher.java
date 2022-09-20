package com.icaballero.app.service;

import java.util.Optional;

import com.icaballero.app.domain.User;
import com.icaballero.app.repository.UserRepository;

public class UserSearcher {

	private UserRepository usersRepository;

	public UserSearcher(UserRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	public Optional<User> search(Integer id) {
		return usersRepository.search(id);
	}

}
