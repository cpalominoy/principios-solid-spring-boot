package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.entity.Expense;
import com.develop.solidprinciplesv1.core.service.ExpenseService;
import com.develop.solidprinciplesv1.repository.ExpenseRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

  private final ExpenseRepository expenseRepository;

  public List<Expense> getExpenses() {
    return expenseRepository.findAll();
  }

  @Override
  public Expense getExpense(Long id) {
    return expenseRepository.findById(id).orElse(null);
  }

  @Override
  public void deleteExpense(Long id) {
    expenseRepository.deleteById(id);
  }

  @Override
  public Expense createExpense(Expense expense) {
    return expenseRepository.save(expense);
  }

  @Override
  public Expense saveExpense(Expense expense) {
    return expenseRepository.save(expense);
  }
}
