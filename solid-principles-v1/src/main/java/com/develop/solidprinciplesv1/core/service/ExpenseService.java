package com.develop.solidprinciplesv1.core.service;

import com.develop.solidprinciplesv1.core.entity.Expense;
import java.util.List;

public interface ExpenseService {

  List<Expense> getExpenses();

  Expense getExpense(Long id);

  void deleteExpense(Long id);

  Expense createExpense(Expense expense);

  Expense saveExpense(Expense expense);
}
