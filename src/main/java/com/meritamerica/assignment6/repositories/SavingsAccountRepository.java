package com.meritamerica.assignment6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment6.models.SavingsAccount;

public interface SavingsAccountRepository extends JpaRepository <SavingsAccount, Integer>{

}