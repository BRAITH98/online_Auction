package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.User;

import java.util.List;

public interface ServiceImpl {

    User saveUser(User user);
    List<User> getAllUsers();
    User findById(int id);
    void deleteUser(int id);
}
