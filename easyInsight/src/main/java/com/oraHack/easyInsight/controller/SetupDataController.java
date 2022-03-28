package com.oraHack.easyInsight.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetupDataController {

    @GetMapping("/getData")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> enabledTenants() throws Exception {

        return new ResponseEntity<>("Status", HttpStatus.OK);
    }
}
