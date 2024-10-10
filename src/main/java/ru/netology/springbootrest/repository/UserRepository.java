package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("0000")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("director") && password.equals("1000")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("manager") && password.equals("0010")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
