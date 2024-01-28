package com.isw.welcome.repository;

import com.isw.welcome.entity.Welcome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WelcomeRepository extends JpaRepository<Welcome, Long> {
    // Add custom repository methods if needed
}
