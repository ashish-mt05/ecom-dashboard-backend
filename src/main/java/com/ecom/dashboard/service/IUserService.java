package com.ecom.dashboard.service;

import com.ecom.dashboard.model.Login;
import com.ecom.dashboard.model.User;

public interface IUserService {
    User addUser(User user);
    Boolean loginUser(Login login);
}
