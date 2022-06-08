package com.develop.solidprinciplesv1.core.service;

import com.develop.solidprinciplesv1.core.entity.Income;
import java.util.List;

public interface IncomeService {

  List<Income> getIncomes();

  Income getIncome(Long id);

  void deleteIncome(Long id);

  Income createIncome(Income income);

  Income saveIncome(Income income);

  Integer getTotalIncomes();
}
