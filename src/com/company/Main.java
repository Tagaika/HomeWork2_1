package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Дэдлайн 3 дня)
        Основное
        a)  Доделать все пункты практического задания по презентации
        b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
        c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
        d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
        e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
        f)  В классе 3-го уровня перезаписать один из методов родителя
        g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.
    */
        Parents Parents = new Parents("KARPINKA", 12);
        Children children = new Children("KARPINKA", 12, "Black");
        Children children2 = new Children("Bokonbaevo", 15555, "White");


        System.out.println("Родители живут по адресу : " + Parents.getAddress()+ ", ПЛощадь дома составляет " + Parents.floors(30000) + "," +
                " Их дом сделан из " +         Parents.floors("Plastic") +"."+
                "  У них есть "+ Parents.getCountOfChildren()+" детей" );
        System.out.println("Ребенок живет по адресу: "+ children.getAddress()+ ", ПЛощадь дома составляет " + children.floors(78000) + ","+
                " Его дом сделан из " +         children.floors("Iron") +"."+  " Цвет кожи "+ children.getSkin());
        System.out.println("Ребенок 2 живет по адресу: "+ children2.getAddress()+  ", ПЛощадь дома составляет " + children2.floors(73999) + ","+
                " Его дом сделан из " +         children2.floors("Beton")+"." + " Цвет кожи "+ children2.getSkin());



    }


}
