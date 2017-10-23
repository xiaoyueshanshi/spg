package com.springpg.spg;

import com.springpg.config.JpaConfiguration;
import com.springpg.entity.User;
import com.springpg.repository.DepartmentRepository;
import com.springpg.repository.RoleRepository;
import com.springpg.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfiguration.class})
public class GpTest {
   // private static Logger logger = LoggerFactory.getLogger(GpTest.class);
    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    RoleRepository roleRepository;

    @Before
    public void initDate()
    {
        System.out.println("**************************");
        userRepository.deleteAll();
        roleRepository.deleteAll();
        departmentRepository.deleteAll();

        User user = new User();
    }

    @Test
    public void find()
    {
        userRepository.findAll();
        System.out.println("--------------------");
        System.out.println("TEST END...");
    }


}
