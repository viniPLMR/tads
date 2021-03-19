package com.projeto.tads.repository;

import com.projeto.tads.model.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRespository extends JpaRepository<Registry,Short> {
}
