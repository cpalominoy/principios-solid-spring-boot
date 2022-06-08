package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.CalculatorService;
import com.develop.solidprinciplesv1.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "incomeCalculator")
@RequiredArgsConstructor
public class IncomeCalculatorServiceImpl implements CalculatorService {

  private final IncomeRepository incomeRepository;

  @Override
  public Integer calculateTotal() {
    return incomeRepository.findAll().stream()
        .map(income -> income.getAmount().intValue())
        .reduce(0, Integer::sum);
  }
}
