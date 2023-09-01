package com.jwt.secure.controller;

import java.security.Principal;

public class HomeController {
    @GetMapping("/")
    public String home(Principal principal) {
        return "Hello, " + principal.getName();
    }

    @PreAuthorize("hasAuthority('SCOPE_read')")
    @GetMapping("/secure")
    public String secure() {
        return "This is secured!";
    }
}