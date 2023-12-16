package generics_program;

public class FigureStats<FigureType extends Figure> {

    FigureType[] arr;

    //в конструкторе - передаем массив фигур
    FigureStats(FigureType[] arr) {
        this.arr = arr;
    }

    //подсчитываем сумму площадей всех фигур
    public double getSumArea() {
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i].getArea();
        }
        return result;
    }

    //подсчитываем максимальную площадь фигуры
    public double getMaxArea() {
        double maxarea = Double.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (maxarea < arr[i].getArea()) {
                maxarea = arr[i].getArea();
            }
        }
        return maxarea;
    }

    //рассчитываем минимальную площадь фигуры
    public double getMinArea() {
        double minarea = Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (minarea > arr[i].getArea()) {
                minarea = arr[i].getArea();
            }
        }
        return minarea;
    }
}
