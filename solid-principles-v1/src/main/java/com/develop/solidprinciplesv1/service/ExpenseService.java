package com.develop.solidprinciplesv1.service;

import com.develop.solidprinciplesv1.entity.Expense;
import com.develop.solidprinciplesv1.repository.ExpenseRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseService {

  private final ExpenseRepository expenseRepository;

  public List<Expense> getExpense() {
    return expenseRepository.findAll();
  }
}
