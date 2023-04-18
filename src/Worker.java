public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    private OnTaskErrorListener errorcallback;


    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorcallback) {

        this.callback = callback;
        this.errorcallback = errorcallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            callback.onDone("Task " + "№" + i + " is done");
        }
        System.out.println();
        for (int j = 1; j <= 100; j++) {
            if (j == 33) {
                System.out.println("Error! " + "Задача №33 не может быть выполнена!");
                break;
            } else {
                errorcallback.onError("Task " + "№" + j + " is done");
            }
        }
    }
}




