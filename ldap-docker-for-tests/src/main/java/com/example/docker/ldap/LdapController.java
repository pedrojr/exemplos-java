package com.example.docker.ldap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class LdapController {
    private LdapService ldapService;

    public LdapController() {
        ldapService = new LdapService();
    }

    @GetMapping()
    public ResponseEntity<List<UserDTO>> listAll() {
        try {
            return new ResponseEntity<>(ldapService.getUsers(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
