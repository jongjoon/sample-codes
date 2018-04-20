package com.woowahan.qa.study;

@FunctionalInterface
public interface ArithmeticOperation {
   double operate(double x, double y);

   default void description() {
       System.out.println("default method");
   }
}
