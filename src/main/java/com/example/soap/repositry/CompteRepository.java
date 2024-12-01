package com.example.soap.repositry;

import com.example.soap.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
