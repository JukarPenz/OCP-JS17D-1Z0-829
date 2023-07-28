package com.jukarpenz.cert.prep.ocpjs17d;

import java.time.Instant;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
You have access to the Item class and Category enum.


class Item {
    String name;
    String color;
    Instant created;
    Integer categoryID;
    Category category; // will be null until you set it
}

enum Category {
  HAZARDOUS, OVERSIZED, FRAGILE, OBLONG, HEAVY
}

*/
class Item {
    String name;
    String color;
    Instant created;
    Integer categoryID;
    Category category; // will be null until you set it
}

enum Category {
    HAZARDOUS, OVERSIZED, FRAGILE, OBLONG, HEAVY
}
public class FilterMapSolution {

    public static List<Item> solve(List<Item> items){
        // Reduce and return the correct solution

        List<Item> reds = items.stream()
//       .allMatch(i-> "Red".equals(i.color) && java.time.temporal.ChronoUnit.DAYS.between(i.created, Instant.now()) < 7 )
                .filter(i-> "Red".equals(i.color) && java.time.temporal.ChronoUnit.DAYS.between(i.created, Instant.now()) < 7 )
//       .filter( item-> item.color.equals("Red") && item.created.compareTo(Instant.now().minus(7,java.time.temporal.ChronoUnit.DAYS))>0)
//       .sorted(Comparator.comparing(it-> it.category.getValue()>it.category.getValue()))
                .sorted(Comparator.comparing(it-> it.category.name()))
                .collect(Collectors.toList());

        for(Item ir:reds){
            System.out.println(ir.category + ":" + ir.color + "->" + ir.categoryID+". " + ir.created);
        }

        return reds;
    }

}