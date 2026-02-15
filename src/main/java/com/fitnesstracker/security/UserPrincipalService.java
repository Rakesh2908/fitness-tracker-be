package com.fitnesstracker.security;

import com.fitnesstracker.entity.User;
import com.fitnesstracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Loads user by ID for JWT authentication (used by JwtAuthenticationFilter).
 */
@Service
@RequiredArgsConstructor
public class UserPrincipalService {

    private final UserRepository userRepository;

    public UserPrincipal loadUserById(Long userId) {
        return userRepository.findById(userId)
                .map(UserPrincipal::from)
                .orElse(null);
    }
}
