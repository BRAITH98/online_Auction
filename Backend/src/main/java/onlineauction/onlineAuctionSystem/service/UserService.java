package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.User;
import onlineauction.onlineAuctionSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements ServiceImpl {

    @Autowired
     private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();

        }else{
            throw new IllegalStateException("User with id:  " + id + " already exists");
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepository.findById(id).orElseThrow();
        new IllegalStateException("User with id: "+id+" does not exist");
        userRepository.deleteById(id);
    }
}
