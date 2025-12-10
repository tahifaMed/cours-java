package com.example.annotations;

public class Personne {

    @RestritionAge(min=5,max = 70,message = "l'age des personnes de doit pas etre inférieur à 0 ou supérieur à 100")
    private int age;

    public Personne(int age){
        this.age = age;
    }

    public int getAge() {return age;}

    @Override
    public String toString() {
        return "Personne{" +
                "age=" + age +
                '}';
    }
}
