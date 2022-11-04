package a.levchenko.codewar;

import a.levchenko.codewar.math.ArraysKata;

public class Main {

    public static void main(String[] args) {
        ArraysKata kata = new ArraysKata(); //Тут внутри метода мейн создался обьект `kata` типа ArraysKata
        kata.map();                         //А тут у этого обьекта вызвал метод map
    }

}
