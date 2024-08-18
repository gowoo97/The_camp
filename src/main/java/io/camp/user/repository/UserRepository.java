package io.camp.user.repository;

import io.camp.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
    Boolean existsByEmail(String email);
    User findByEmail(String email);

}