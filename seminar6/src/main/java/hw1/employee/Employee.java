package hw1.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Open-Closed Principle
 */
@Data
@AllArgsConstructor
public abstract class Employee {
    private String name;
    protected int id;

}
