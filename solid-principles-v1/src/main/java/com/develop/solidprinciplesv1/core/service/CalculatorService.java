package com.develop.solidprinciplesv1.core.service;

import java.util.List;

public interface CalculatorService<T> extends Service {

  Integer calculateTotal(List<T> list);
}
