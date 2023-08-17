package com.example.demo.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto);

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    Optional<User> getUserByPasswordResetToken(String token);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);

    String generateQRUrl(User user) throws UnsupportedEncodingException;

    User updateUser2FA(boolean use2FA);

    List<String> getUsersFromSessionRegistry();

    String isValidNewLocationToken(String token);

    void addUserLocation(User user, String ip);
}