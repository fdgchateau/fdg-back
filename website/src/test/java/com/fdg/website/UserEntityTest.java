package com.fdg.website;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fdg.website.Entities.UserEntity;

@SpringBootTest
public class UserEntityTest {
    
       @Test
    public void testUserEntityToString() {
        UserEntity user = new UserEntity();
        user.setIdUser(1);
        user.setName("John");
        user.setFirstname("Doe");
        user.setEmail("john.doe@example.com");
        user.setPhone("1234567890");
        user.setSubject("Test");
        user.setComment("Test comment");

        String expectedString = "{ idUser='1', name='John', firstname='Doe', email='john.doe@example.com', phone='1234567890', subject='Test', comment='Test comment'}";
        Assertions.assertEquals(expectedString, user.toString());
    }
}
