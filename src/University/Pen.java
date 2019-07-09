package University;

import java.util.ArrayList;
import java.util.List;

public class Pen {
    private String color;
    private float lineThickness;

    public Pen(String color, float lineThickness) {
        this.color = color;
        this.lineThickness = lineThickness;
    }

    void write(){
        System.out.println("Pen write!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(float lineThickness) {
        this.lineThickness = lineThickness;
    }
}