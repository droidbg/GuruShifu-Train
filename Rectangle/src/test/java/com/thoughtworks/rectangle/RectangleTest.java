package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
   void shouldReturnAreaWhenPassedLengthAndBreadth(){
Rectangle rectangle=new Rectangle(3.0,4.0);
double result= rectangle.area();
assertThat(result,closeTo(12.0, 1.0));
    }

    @Test
    void shouldReturnPerimeterWhenPassedLengthAndBreadth(){
        Rectangle rectangle=new Rectangle(3.0,5.0);
    double result= rectangle.perimeter();
assertThat(result, closeTo(16.0, 1.0));

    }

    
}
