package com.develop.solidprinciplesv1.repository;

import com.develop.solidprinciplesv1.core.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {}
