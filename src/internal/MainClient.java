package internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class MainClient {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue = new LinkedList<>();

        queue.offer(null);

        Deque<Integer> deque = new ArrayDeque<>();
//        deque.offer(null);

        Set<Integer> set = new TreeSet<>();
        set = Collections.synchronizedSet(set);

        set.add(1);
        set.add(1);

        System.out.println(set);


    }
}
