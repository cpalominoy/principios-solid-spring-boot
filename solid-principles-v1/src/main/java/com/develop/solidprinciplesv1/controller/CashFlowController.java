package com.develop.solidprinciplesv1.controller;

import com.develop.solidprinciplesv1.entity.Expense;
import com.develop.solidprinciplesv1.entity.Income;
import com.develop.solidprinciplesv1.service.CashFlowService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashflow")
@RequiredArgsConstructor
public class CashFlowController {

  private final CashFlowService cashFlowService;

  @GetMapping("/incomes")
  public List<Income> getIncomes() {
    return cashFlowService.getIncomes();
  }

  @GetMapping("/expenses")
  public List<Expense> getExpenses() {
    return cashFlowService.getExpenses();
  }
}
