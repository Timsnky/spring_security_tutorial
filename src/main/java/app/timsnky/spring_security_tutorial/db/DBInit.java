package app.timsnky.spring_security_tutorial.db;

import app.timsnky.spring_security_tutorial.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DBInit implements CommandLineRunner {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public DBInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        // Delete all
        this.userRepository.deleteAll();

        // Crete users
        User user = new User("user",passwordEncoder.encode("password"),"USER","");
        User admin = new User("admin",passwordEncoder.encode("password"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("password"),"MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(user,admin,manager);

        // Save to db
        this.userRepository.saveAll(users);
    }
}
