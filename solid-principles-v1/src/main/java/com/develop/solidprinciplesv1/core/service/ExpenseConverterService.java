package com.develop.solidprinciplesv1.core.service;

import com.develop.solidprinciplesv1.database.entity.Expense;

public interface ExpenseConverterService extends ConverterService {

  Expense convertExpense(Expense expense);
}
