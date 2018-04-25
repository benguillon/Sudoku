package com.example.travail.sudoku;

/**
 * Created by Travail on 25/04/2018.
 */

public class vGrille {
    int level;
    int num;
    int done;

    public vGrille(int level, int num, int done){
        System.out.println("Création d'une vGrille !");
        this.level = level;
        this.num = num;
        this.done = done;
    }

    public int getLevel() {
        return level;
    }

    public int getNum(){
        return num;
    }
}
