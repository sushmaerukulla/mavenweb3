package com.sushma.web3.dao;

import com.sushma.web3.model.Register;

public interface AuthenticationDao {
boolean insert(Register reg);
public boolean login(String email,String password);
Register getUser(String username);
}
