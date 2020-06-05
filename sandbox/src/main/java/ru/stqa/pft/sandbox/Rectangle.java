package ru.stqa.pft.sandbox;

/*
мы создаем класс, который описывает объект (прямоугольник), площадь которого мы вычисляем
этот класс описывает структуру объектов, хранящих информацию о прямоугольнике
*/

/* описываем аттрибуты , которыми  обладает объект этого типа */
public class Rectangle {
  public double a;
  public double b;

  public Rectangle(double a, double b){
    this.a = a;
    this.b = b;
  }

  public double area (){
    return this.a * this.b;
  }
}
