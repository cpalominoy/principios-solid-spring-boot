package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.IncomeConverterService;
import com.develop.solidprinciplesv1.database.entity.Income;
import org.springframework.stereotype.Component;

@Component
public class IncomeConverterServiceImpl implements IncomeConverterService {

  @Override
  public Income convertIncome(Income income) {
    return income;
  }
}
