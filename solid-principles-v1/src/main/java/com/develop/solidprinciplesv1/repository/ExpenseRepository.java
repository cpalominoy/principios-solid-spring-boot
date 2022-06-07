package com.develop.solidprinciplesv1.repository;

import com.develop.solidprinciplesv1.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {}
