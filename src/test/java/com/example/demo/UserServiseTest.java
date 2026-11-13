package com.example.demo;

import com.example.demo.Models.UserModel;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.LoginRequest;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtUtils;
import com.example.demo.servise.UserServise;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiseTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private JwtUtils jwtUtils;

    @InjectMocks
    private UserServise userService;

    @Test
    void loginUser_shouldReturnRoleWithoutRolePrefix() {
        UserModel user = new UserModel();
        user.setEmail("test@example.com");
        user.setPassword("encodedPassword");
        user.setRole("ROLE_USER");

        LoginRequest request = new LoginRequest();
        request.setEmail("test@example.com");
        request.setPassword("plainPassword");

        when(userRepository.findByEmail("test@example.com")).thenReturn(Optional.of(user));
        when(passwordEncoder.matches("plainPassword", "encodedPassword")).thenReturn(true);
        when(jwtUtils.generateToken("test@example.com", "USER")).thenReturn("token");

        AuthResponse response = userService.loginUser(request);

        assertThat(response.getRole()).isEqualTo("USER");
    }
}
