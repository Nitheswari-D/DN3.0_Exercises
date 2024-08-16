package com.example.employeemanagement.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Return the username of the currently logged-in user
        // For simplicity, returning a static username here
        return Optional.of("admin"); // Replace with actual user logic
    }
}
