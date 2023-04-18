class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;
        Worker worker1 = new Worker(listener,errorListener);
        worker1.start();
        System.out.println();

    }
}
//
//        в репозитории никогда не должно быть папки .idea - ее надо добавлять в .gitignore.
//        Сейчас, после добавления этой папки в .gitignore, вам надо будет удалить ее у себя
//        в проекте и сразу же сделать коммит и пуш в репозиторий.
//        Давайте доработаем!