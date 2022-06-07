package com.develop.solidprinciplesv1.controller;

import com.develop.solidprinciplesv1.entity.Expense;
import com.develop.solidprinciplesv1.service.ExpenseService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashflow")
@RequiredArgsConstructor
public class ExpenseController {

  private final ExpenseService expenseService;

  @GetMapping("/expenses")
  public List<Expense> getExpense() {
    return expenseService.getExpense();
  }
}
