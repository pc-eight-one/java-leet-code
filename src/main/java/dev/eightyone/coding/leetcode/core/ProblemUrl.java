package dev.eightyone.coding.leetcode.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ProblemUrl {
    String url();
}
