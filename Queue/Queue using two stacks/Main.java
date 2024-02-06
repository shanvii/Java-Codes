import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class QueueUsingTwoStacks {
    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    public QueueUsingTwoStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(int x) {
        stackEnqueue.push(x);
    }

    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        return stackDequeue.isEmpty() ? -1 : stackDequeue.pop();
    }

    public int front() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        return stackDequeue.isEmpty() ? -1 : stackDequeue.peek();
    }
}

public class Main {
    public static List<Integer> processQueries(List<int[]> queries) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int queryType = query[0];

            switch (queryType) {
                case 1:
                    int x = query[1];
                    queue.enqueue(x);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    result.add(queue.front());
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<int[]> sampleInput = Arrays.asList(
                new int[]{1, 42},
                new int[]{2},
                new int[]{1, 14},
                new int[]{3},
                new int[]{1, 28},
                new int[]{3},
                new int[]{1, 60},
                new int[]{1, 78},
                new int[]{2},
                new int[]{2}
        );

        List<Integer> output = processQueries(sampleInput);

        for (int value : output) {
            System.out.println(value);
        }
    }
}
