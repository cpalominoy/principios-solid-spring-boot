package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.CalculatorService;
import com.develop.solidprinciplesv1.database.entity.Income;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "incomeCalculator")
@RequiredArgsConstructor
public class IncomeCalculatorServiceImpl implements CalculatorService<Income> {

  @Override
  public Integer calculateTotal(List<Income> list) {

    return list.stream().map(income -> income.getAmount().intValue()).reduce(0, Integer::sum);
  }
}
