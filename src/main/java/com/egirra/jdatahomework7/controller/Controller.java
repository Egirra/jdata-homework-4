package com.egirra.jdatahomework7.controller;

import com.egirra.jdatahomework7.repository.Repository;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @Secured({"ROLE_READ"})
    @GetMapping("/read")
    public String read() {
        return "read";
    }

    @RolesAllowed({"ROLE_WRITE"})
    @GetMapping("/write")
    public String write() {
        return "write";
    }

    @PreAuthorize("hasAnyRole('ROLE_WRITE, ROLE_DELETE')")
    @GetMapping("/wd")
    public String writeOrDelete() {
        return "write or delete";
    }

    @PostAuthorize("#username == authentication.principal.username")
    @GetMapping("/hello")
    public String coincidence(String username) {
        return "hello" + username;
    }
}