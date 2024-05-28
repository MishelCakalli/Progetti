package it.epicode.u5w3d1.repository;

import it.epicode.u5w3d1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
