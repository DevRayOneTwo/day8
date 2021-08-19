package ru.devray.day8.anonymous.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceLauncher {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add("abc");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add("abc");


        Executable addOperation = new Executable() {
            @Override
            public void execute(List<String> list) {
                list.add(2, new String("5153"));
            }
        };

        //anonymous
        Executable getOperation = new Executable() {
            @Override
            public void execute(List<String> list) {
                list.get(list.size() / 2);
            }

        };


        Executable getOperation1 = list -> list.get(list.size() / 2);

        Executable setOperation = (list) -> list.set(0, "123");



        measurePerformance(100000, addOperation, arrayList);
        measurePerformance(100000, addOperation, linkedList);

        measurePerformance(100000, getOperation, arrayList);
        measurePerformance(100000, getOperation, linkedList);
    }


    public static void measurePerformance(int executionCount, Executable executable, List<String> listUnderTest){
        long beforeTime = System.currentTimeMillis();
        for(int i = 0; i < executionCount; i++){
            executable.execute(listUnderTest);
        }
        long afterTime = System.currentTimeMillis();

        System.out.println(afterTime - beforeTime);
    }
}
