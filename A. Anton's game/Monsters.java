package com.company;

import java.util.*;

class Monster{
    Integer num;
    Integer power;
    Monster(Integer i, Integer Power){
        num = i;
        power = Power;
    }
}

public class Monsters {

    public static void main(String[] args) throws Exception{
        Scanner myScan = new Scanner (System.in);

        int curLevel = 1;
        int numInjuries = 0;
        int curMonsterLevel;
        int n = myScan.nextInt ();
        ArrayList<Monster> monsterArray = new ArrayList<Monster>(n);
        //TreeMap<Integer, Integer> monsterMap = new TreeMap<Integer, Integer>();
        for(int i=0; i<n ; i++){
            monsterArray.add(new Monster(i+1, myScan.nextInt()));
        }
        Collections.sort(monsterArray, (Monster a, Monster b) -> a.power-b.power);

        Iterator<Monster> iter = monsterArray.iterator();

        while (iter.hasNext()) {
            curMonsterLevel = iter.next().power;
            if(curLevel>=curMonsterLevel){
                //win
                if(curLevel<curMonsterLevel*2){
                    if(numInjuries>=2){
                        curLevel--;
                        numInjuries=0;
                    }
                    else{
                        numInjuries++;
                    }
                }
                curLevel++;
            }
            else{
                //loss
                System.out.println("Impossible");
                System.exit(0);
                break;
            }
        }
        System.out.println("Possible");
        iter = monsterArray.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().num+" ");
        }
    }
}




/*
        есть ли четкое совпадение
        50%
        40%
        25%
        10%
         */