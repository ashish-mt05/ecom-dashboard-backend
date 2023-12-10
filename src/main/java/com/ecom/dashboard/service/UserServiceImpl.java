package com.ecom.dashboard.service;

import com.ecom.dashboard.model.Login;
import com.ecom.dashboard.model.User;
import com.ecom.dashboard.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean loginUser(Login login) {
        boolean isUserLoggedIn = false;
        User user = userRepository.findByUserName(login.getUserName());
        if (login.getUserName().equalsIgnoreCase(user.getUserName())
                && login.getPassword().equalsIgnoreCase(user.getPassword())) {
            isUserLoggedIn = true;
        }

        return isUserLoggedIn;
    }
}
