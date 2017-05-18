package org.hrd.kotlin.kotlin.repositories;

import org.hrd.kotlin.kotlin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RATHANA on 18-May-17.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String name);
}
