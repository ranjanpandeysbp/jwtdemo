package com.mycompany.jwtdemo;


import com.mycompany.jwtdemo.entity.RoleEntity;
import com.mycompany.jwtdemo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Appstartup implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        List<RoleEntity> roles = roleRepository.findAll();
        if(roles.isEmpty()){
            RoleEntity re = new RoleEntity();
            re.setId(111L);
            re.setRoleName("ROLE_USER");
            roleRepository.save(re);

            re = new RoleEntity();
            re.setId(999L);
            re.setRoleName("ROLE_ADMIN");
            roleRepository.save(re);
        }
    }
}
