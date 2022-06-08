package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.CalculatorService;
import com.develop.solidprinciplesv1.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "expenseCalculator")
@RequiredArgsConstructor
public class ExpenseCalculatorServiceImpl implements CalculatorService {

  private final ExpenseRepository expenseRepository;

  @Override
  public Integer calculateTotal() {
    return expenseRepository.findAll().stream()
        .map(income -> income.getAmount().intValue())
        .reduce(0, Integer::sum);
  }
}
