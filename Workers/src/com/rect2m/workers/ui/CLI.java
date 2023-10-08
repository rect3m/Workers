package com.rect2m.workers.ui;

import com.rect2m.workers.logic.EmployeeData;
import com.rect2m.workers.model.Worker;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class CLI {

  private static final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

  public static void init() {
    getWorkerExperiencePrint();
    getWorkerSalaryPrint();
    getWorkerPositionPrint();
  }

  private static String getWorkerPositionPrint() {
    String workerPosition;
    System.out.print("Введіть посаду: ");

    workerPosition = scanner.next();
    List<Worker> workers = EmployeeData.getPosition(workerPosition);

    for (Worker worker : workers) {
      System.out.printf("%s%n", worker);
    }

    return workerPosition;
  }

  private static int getWorkerSalaryPrint() {
    int minSalary;

    System.out.print("Введіть зарплату: ");
    minSalary = scanner.nextInt();

    List<Worker> workers = EmployeeData.getSalary(minSalary);

    for (Worker worker : workers) {
      System.out.printf("%s%n", worker);
    }

    return 1;
  }

  private static int getWorkerExperiencePrint() {
    int experience;

    System.out.print("Введіть стаж працівника: ");
    experience = scanner.nextInt();

    List<Worker> workers = EmployeeData.getExperience(experience);

    for (Worker worker : workers) {
      System.out.printf("%s%n", worker);
    }

    return 1;
  }
}