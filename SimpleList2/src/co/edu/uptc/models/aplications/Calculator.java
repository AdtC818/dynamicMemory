package co.edu.uptc.models.aplications;

import java.util.List;

public class Calculator<T extends Number> { 
    private List<T> list;
    private double result = 0;

    public Calculator(List<T> list) {
        this.list = list;
    }

    public void sumData() {
        for (T element : list) {
            result += element.doubleValue(); 
        }
    }

    public double getResult() {
        return result;
    }
}