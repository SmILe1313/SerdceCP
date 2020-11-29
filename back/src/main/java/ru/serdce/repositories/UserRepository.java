package ru.serdce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.serdce.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByLoginAndPassword(String login, String password);
}
