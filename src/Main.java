class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;
        Worker worker1 = new Worker(listener,errorListener);
        worker1.start();
        System.out.println();
        // не разобрался как удалить папку идеа из гитхаба??
        //добавить ссылку нельзя, решил ее добавить сюда понял сейчас что надо было
        //все на один адрес скидыватьдавно проходили гит сейчас потихоньку вспоминаю
        //https://github.com/Dmitros1980/core.liamda1.git
    }
}
//
//        в репозитории никогда не должно быть папки .idea - ее надо добавлять в .gitignore.
//        Сейчас, после добавления этой папки в .gitignore, вам надо будет удалить ее у себя
//        в проекте и сразу же сделать коммит и пуш в репозиторий.
//        Давайте доработаем!