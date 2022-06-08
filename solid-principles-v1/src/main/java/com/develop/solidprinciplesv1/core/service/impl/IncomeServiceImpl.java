package com.develop.solidprinciplesv1.core.service.impl;

import com.develop.solidprinciplesv1.core.service.CalculatorService;
import com.develop.solidprinciplesv1.core.service.IncomeService;
import com.develop.solidprinciplesv1.database.entity.Income;
import com.develop.solidprinciplesv1.database.repository.IncomeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {

  private final IncomeRepository incomeRepository;

  private final CalculatorService incomeCalculator;

  public List<Income> getIncomes() {
    return incomeRepository.findAll();
  }

  @Override
  public Income getIncome(Long id) {
    return incomeRepository.findById(id).orElse(null);
  }

  @Override
  public void deleteIncome(Long id) {
    incomeRepository.deleteById(id);
  }

  @Override
  public Income createIncome(Income income) {
    return incomeRepository.save(income);
  }

  @Override
  public Income saveIncome(Income income) {
    return incomeRepository.save(income);
  }

  @Override
  public Integer getTotalIncomes() {
    return incomeCalculator.calculateTotal();
  }
}
