package dev.eightyone.coding.leetcode.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface RevisitSolution {
    String value() default "";
}
