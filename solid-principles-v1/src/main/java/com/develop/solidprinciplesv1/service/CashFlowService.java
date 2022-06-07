package com.develop.solidprinciplesv1.service;

import com.develop.solidprinciplesv1.entity.Expense;
import com.develop.solidprinciplesv1.entity.Income;
import com.develop.solidprinciplesv1.repository.ExpenseRepository;
import com.develop.solidprinciplesv1.repository.IncomeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashFlowService {

  private final IncomeRepository incomeRepository;
  private final ExpenseRepository expenseRepository;

  public List<Income> getIncomes() {
    return incomeRepository.findAll();
  }

  public List<Expense> getExpenses() {

    return expenseRepository.findAll();
  }
}
