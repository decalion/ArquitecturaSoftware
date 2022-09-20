package com.icaballero.app.repository;

import java.util.Optional;

import com.icaballero.app.domain.User;

public interface UserRepository {
	Optional<User> search(Integer id);
}
