package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.CalculatorService;
import com.develop.solidprinciplesv1.database.entity.Expense;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "expenseCalculator")
@RequiredArgsConstructor
public class ExpenseCalculatorServiceImpl implements CalculatorService<Expense> {

  @Override
  public Integer calculateTotal(List<Expense> list) {
    return list.stream().map(expense -> expense.getAmount().intValue()).reduce(0, Integer::sum);
  }
}
