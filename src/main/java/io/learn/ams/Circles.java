package io.learn.ams;

public class Circles {

    void getArea() {

        Draw draw = new Draw();
        draw.area(); //call to public method area(), within package
        draw.fillColor(); // call to a method with default access modifier within package
    }
}
