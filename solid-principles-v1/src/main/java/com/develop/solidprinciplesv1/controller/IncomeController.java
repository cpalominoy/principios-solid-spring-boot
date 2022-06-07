package com.develop.solidprinciplesv1.controller;

import com.develop.solidprinciplesv1.entity.Income;
import com.develop.solidprinciplesv1.service.IncomeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
}
