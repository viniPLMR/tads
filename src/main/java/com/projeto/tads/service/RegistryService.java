package com.projeto.tads.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistryService {

    public void updateRegistry();

    public List<?> getRegistry();

    public void createRegistry();

    public void deleteRegistry();

}
