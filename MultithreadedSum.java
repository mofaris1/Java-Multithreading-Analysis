class SumTask implements Runnable {
    private long start, end;
    private long sum = 0;

    public SumTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (long i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class a {
    public static void main(String[] args) throws Exception {

        int numThreads = Integer.parseInt(args[0]);
        long N = 160653;

        Thread[] threads = new Thread[numThreads];
        SumTask[] tasks = new SumTask[numThreads];

        long chunk = N / numThreads;

        long startTime = System.nanoTime();

        for (int i = 0; i < numThreads; i++) {
            long start = i * chunk + 1;
            long end = (i == numThreads - 1) ? N : (i + 1) * chunk;

            tasks[i] = new SumTask(start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
            totalSum += tasks[i].getSum();
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Number of Threads: " + numThreads);
        System.out.println("Final Sum: " + totalSum);
        System.out.println("Execution Time (ms): " + timeMs);
    }
}

