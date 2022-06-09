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

  private final CalculatorService<Income> incomeCalculator;

  @Override
  public List<Income> getAll() {
    return incomeRepository.findAll();
  }

  @Override
  public Income get(Long id) {
    return incomeRepository.findById(id).orElse(null);
  }

  @Override
  public Income create(Income income) {
    return incomeRepository.save(income);
  }

  @Override
  public Income save(Income income) {
    return incomeRepository.save(income);
  }

  @Override
  public void delete(Long id) {
    incomeRepository.deleteById(id);
  }

  @Override
  public Integer getTotal() {
    return incomeCalculator.calculateTotal(incomeRepository.findAll());
  }
}
