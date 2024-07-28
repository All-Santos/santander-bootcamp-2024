package me.dio.santander_bootcamp_2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.wesleyav.desafioapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
