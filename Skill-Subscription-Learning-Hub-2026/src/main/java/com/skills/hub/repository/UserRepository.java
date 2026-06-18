package com.skills.hub.repository;

import com.skills.hub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/*
=========================================================
WHAT IS THIS FILE?
=========================================================

UserRepository is used to communicate with the database
for USER-related operations.

 It automatically handles:
- Save user
- Find user
- Delete user
- Update user

=========================================================

SIMPLE MEANING:
No SQL needed — Spring handles it automatically
=========================================================
*/

public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query method
    // Used for login validation
   Optional<User>findByEmail(String email);
}