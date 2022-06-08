package com.develop.solidprinciplesv1.api.controller;

import com.develop.solidprinciplesv1.core.service.ExpenseService;
import com.develop.solidprinciplesv1.database.entity.Expense;
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
public class ExpenseController {

  private final ExpenseService expenseService;

  @GetMapping("/expenses")
  public List<Expense> getExpense() {
    return expenseService.getExpenses();
  }

  @GetMapping("/expense/{id}")
  public Expense getExpense(@PathVariable("id") Long id) {
    return expenseService.getExpense(id);
  }

  @DeleteMapping("/expense/{id}")
  public void deleteExpense(@PathVariable("id") Long id) {
    expenseService.deleteExpense(id);
  }

  @PostMapping("/expense")
  public Expense createExpense(@RequestBody Expense expense) {
    return expenseService.createExpense(expense);
  }

  @PutMapping("/expense")
  public Expense saveExpense(@RequestBody Expense expense) {
    return expenseService.saveExpense(expense);
  }

  @GetMapping("/expense/total")
  public Integer getTotalExpenses() {
    return expenseService.getTotalExpenses();
  }
}
