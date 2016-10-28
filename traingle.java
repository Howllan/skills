/**
 * Created by hasee on 2016/10/28.
 */
public class traingle extends Shape{
    void area(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
        p=(a+b+c)/2;
        traingle = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        System.out.println("三角形的面积是"+traingle);
    };
}
