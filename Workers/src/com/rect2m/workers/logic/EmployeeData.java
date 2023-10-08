package com.rect2m.workers.logic;

import com.rect2m.workers.model.Worker;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {

  private static final Worker[] workers = {
      new Worker("Мельник О.П.", "Адміністратор", 2000,
          9000),
      new Worker("Жулканич Ю.Ю.", "СторожовийПес", 2006,
          0),//за їду)
      new Worker("Бойко Ю.М.", "Водій", 2002,
          7000),
      new Worker("Мороз В.І.", "Водій", 2005,
          7000),
      new Worker("Мазур М.О.", "Охорона", 2008,
          5000),
      new Worker("Марчук Д.А.", "Адміністратор", 2015,
          9000),
      new Worker("Бабенко О.О.", "Продавець", 2009,
          8000),
  };

  public static List<Worker> getPosition(String workerPosition) {
    return Arrays.stream(workers)
        .filter(worker -> worker.position().equalsIgnoreCase(workerPosition))
        .toList();
  }

  public static List<Worker> getSalary(int minSalary) {
    return Arrays.stream(workers)
        .filter(
            worker -> minSalary < worker.salary())
        .toList();
  }

  public static List<Worker> getExperience(int experience) {
    return Arrays.stream(workers)
        .filter(
            worker -> 2023 - experience >= worker.yearOfArrivalAtWork())
        .toList();
  }
}