package com.develop.solidprinciplesv1.api.controller;

import com.develop.solidprinciplesv1.core.service.IncomeService;
import com.develop.solidprinciplesv1.database.entity.Income;
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

  private final IncomeService incomeService;

  @GetMapping("/incomes")
  public List<Income> getIncomes() {
    return incomeService.getIncomes();
  }

  @GetMapping("/income/{id}")
  public Income getIncome(@PathVariable("id") Long id) {
    return incomeService.getIncome(id);
  }

  @DeleteMapping("/income/{id}")
  public void deleteIncome(@PathVariable("id") Long id) {
    incomeService.deleteIncome(id);
  }

  @PostMapping("/income")
  public Income createIncome(@RequestBody Income income) {
    return incomeService.createIncome(income);
  }

  @PutMapping("/income")
  public Income saveIncome(@RequestBody Income income) {
    return incomeService.saveIncome(income);
  }

  @GetMapping("/income/total")
  public Integer getTotalIncomes() {
    return incomeService.getTotalIncomes();
  }
}
