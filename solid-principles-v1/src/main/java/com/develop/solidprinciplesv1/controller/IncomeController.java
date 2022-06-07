package com.develop.solidprinciplesv1.controller;

import com.develop.solidprinciplesv1.core.entity.Income;
import com.develop.solidprinciplesv1.core.service.impl.IncomeServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashflow")
@RequiredArgsConstructor
public class IncomeController {

  private final IncomeServiceImpl incomeServiceImpl;

  @GetMapping("/incomes")
  public List<Income> getIncomes() {
    return incomeServiceImpl.getIncomes();
  }

  @GetMapping("/income/{id}")
  public Income getIncome(@PathVariable("id") Long id) {
    return incomeServiceImpl.getIncome(id);
  }

  @DeleteMapping("/income/{id}")
  public void deleteIncome(@PathVariable("id") Long id) {
    incomeServiceImpl.deleteIncome(id);
  }

  @PostMapping("/income")
  public Income createIncome(@RequestBody Income income) {
    return incomeServiceImpl.createIncome(income);
  }

  @PutMapping("/income")
  public Income saveIncome(@RequestBody Income income) {
    return incomeServiceImpl.saveIncome(income);
  }
}
