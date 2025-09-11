package com.instamart.shopping_delivery.controllers;

import com.instamart.shopping_delivery.models.AppUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @PostMapping("/customer/registration")
    public void customerRegistration(@RequestBody AppUser customer)
    {

    }
}
