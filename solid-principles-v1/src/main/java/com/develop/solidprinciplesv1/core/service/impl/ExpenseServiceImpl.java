package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.CalculatorService;
import com.develop.solidprinciplesv1.core.service.ExpenseService;
import com.develop.solidprinciplesv1.database.entity.Expense;
import com.develop.solidprinciplesv1.database.repository.ExpenseRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

  private final ExpenseRepository expenseRepository;

  private final CalculatorService<Expense> expenseCalculator;

  @Override
  public List<Expense> getAll() {
    return expenseRepository.findAll();
  }

  @Override
  public Expense get(Long id) {
    return expenseRepository.findById(id).orElse(null);
  }

  @Override
  public Expense create(Expense entity) {
    return expenseRepository.save(entity);
  }

  @Override
  public Expense save(Expense entity) {
    return expenseRepository.save(entity);
  }

  @Override
  public void delete(Long id) {
    expenseRepository.deleteById(id);
  }

  @Override
  public Integer getTotal() {
    return expenseCalculator.calculateTotal(expenseRepository.findAll());
  }
}
