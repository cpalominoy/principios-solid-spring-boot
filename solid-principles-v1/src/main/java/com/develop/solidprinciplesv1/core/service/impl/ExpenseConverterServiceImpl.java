package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.ExpenseConverterService;
import com.develop.solidprinciplesv1.database.entity.Expense;
import org.springframework.stereotype.Component;

@Component
public class ExpenseConverterServiceImpl implements ExpenseConverterService {

  @Override
  public Expense convertExpense(Expense expense) {
    return expense;
  }
}
