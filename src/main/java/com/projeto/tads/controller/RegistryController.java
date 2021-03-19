package com.projeto.tads.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/registry")
public class RegistryController {

    @PutMapping("")
    public ResponseEntity<?> updateRegister (){
        return null;
    }

    @GetMapping("")
    public ResponseEntity<?> getListRegister (){
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createRegister(){
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteRegister(){
        return null;
    }

}
