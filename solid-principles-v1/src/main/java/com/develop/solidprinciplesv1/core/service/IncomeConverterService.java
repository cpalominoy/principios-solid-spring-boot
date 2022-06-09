package com.develop.solidprinciplesv1.core.service;

import com.develop.solidprinciplesv1.database.entity.Income;

public interface IncomeConverterService extends ConverterService {

  Income convertIncome(Income income);
}
