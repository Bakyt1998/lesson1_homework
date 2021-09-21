package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Алабай",3,"Бобик",ColorEnum.BLACK);
        dog.voice("ahgj");
        Puppy puppy = new Puppy("алаб",2);
        puppy.voice();
        dog.getInfo();
        puppy.getInfo();



    }
}

/*a)  Доделать все пункты практического задания по презентации
        f)  В классе 3-го уровня перезаписать один из методов родителя
        g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.
*/