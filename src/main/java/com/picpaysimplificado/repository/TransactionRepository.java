package com.picpaysimplificado.repository;

import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

interface TransactionRepository extends JpaRepository<Transaction, String> {
}
