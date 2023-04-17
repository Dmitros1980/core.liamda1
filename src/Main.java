class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;
        Worker worker1 = new Worker(listener);
        Worker worker = new Worker(errorListener);
        worker1.start();
        System.out.println();
        worker.errorStart();


    }

}

class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    private OnTaskErrorListener errorcallback;

    public Worker(OnTaskErrorListener errorcallback) {
        this.errorcallback = errorcallback;
    }

    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {

        this.callback = callback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            callback.onDone("Task " + "№" + i + " is done");
        }
    }

    public void errorStart() {
        for (int j = 1; j <= 100; j++) {
            if (j == 33) {
                System.out.println("Error! " + "Задача №33 не может быть выполнена!");
            } else {
                errorcallback.onError("Task " + "№" + j + " is done");
            }
        }
    }
}


