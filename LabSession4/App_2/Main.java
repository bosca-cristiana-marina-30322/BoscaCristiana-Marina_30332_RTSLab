package App_2;

public class Main {
    public static void main(String[] args) {
        Integer monitor9 = new Integer(1);
        Integer monitor10 = new Integer(1);

        new ExecutionThread1(monitor9, monitor10, 2, 4,4, 6, 4).start();
		new ExecutionThread2(monitor9, monitor10, 3, 5, 5, 7, 5).start();
    }
}