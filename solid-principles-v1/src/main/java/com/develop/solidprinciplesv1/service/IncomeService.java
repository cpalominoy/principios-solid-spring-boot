package com.develop.solidprinciplesv1.service;

import com.develop.solidprinciplesv1.entity.Income;
import com.develop.solidprinciplesv1.repository.IncomeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncomeService {

  private final IncomeRepository incomeRepository;

  public List<Income> getIncomes() {
    return incomeRepository.findAll();
  }
}
