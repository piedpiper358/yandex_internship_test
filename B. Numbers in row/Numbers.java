package com.company;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class Numbers {

    public static void main(String[] args) throws Exception{
        Integer prevNum = null;
        Integer curNum = null;
        Integer startSequenceIndex = 0;
        Integer countDeletedNums = 0;
        Integer sequenceLength;
        Integer index;
        boolean wasSequence = true;
        LinkedList<Integer> numList = new LinkedList<>();


        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        String x = s.readLine();
        String[] str = x.split(" ");
        for (int i = 0; i < str.length; i++) {
            numList.add(Integer.parseInt(str[i]));
        }
        while(wasSequence){
            //curNum = null;
            //prevNum = null;
            wasSequence = false;
            startSequenceIndex = 0;
            sequenceLength = 1;
            index = 0;

            ListIterator<Integer> iter = numList.listIterator();
            while (iter.hasNext()) {
                if(index==0){
                    prevNum = iter.next(); // инициализируем
                    index++;
                    continue;
                }
                curNum = iter.next();
                if(curNum==prevNum){
                    sequenceLength++;

                    if(!iter.hasNext() && sequenceLength>=3){
                        for (int i = index; i >= startSequenceIndex; i--) {
                            numList.remove(i);
                        }
                        countDeletedNums += sequenceLength;//(index - startSequenceIndex + 1);
                        wasSequence = true;
                        break;
                    }
                }
                if(curNum!=prevNum){
                    if(sequenceLength>=3){
                        for (int i = index - 1; i >= startSequenceIndex; i--) {
                            numList.remove(i); //удаляем в обратном порядке
                        }
                        countDeletedNums += sequenceLength;//(index - startSequenceIndex);
                        wasSequence = true;
                        break;
                    }
                    prevNum=curNum;
                    startSequenceIndex = index;
                    sequenceLength = 1;
                }
                index++;
            }
        }
        System.out.println(countDeletedNums);
    }
}
