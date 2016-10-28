/**
 * Created by hasee on 2016/10/28.
 */
public class round extends Shape{
    void area(double r){
        this.r = r;
        round = 3.1415*r*r;
        System.out.println("圆的面积是"+round);
    };
}
