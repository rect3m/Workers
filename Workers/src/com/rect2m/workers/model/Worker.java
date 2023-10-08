package com.rect2m.workers.model;

import java.util.StringJoiner;

public record Worker(String surnameAndInitials, String position, int yearOfArrivalAtWork,
                     int salary) {

  @Override
  public String toString() {
    return new StringJoiner(", ", "Працівник ", "")
        .add("ПІБ: '%s'".formatted(surnameAndInitials))
        .add("Посада: '%s'".formatted(position))
        .add("Рік прибуття на роботу: '%d'".formatted(yearOfArrivalAtWork))
        .add("Зарплата: '%s'".formatted(salary))
        .toString();
  }

}