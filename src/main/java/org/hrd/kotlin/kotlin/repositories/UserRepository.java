package org.hrd.kotlin.kotlin.repositories;

import org.hrd.kotlin.kotlin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by RATHANA on 18-May-17.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUserName(String name);
    public User findByUserEmail(String email);
    public User findByUserPassword(String password);
}
