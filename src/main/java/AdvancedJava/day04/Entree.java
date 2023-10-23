package AdvancedJava.day04;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Entree {

    private String name;
    private int calories;
    private boolean isVegetarian;
}
