package co.com.sura.screenplay.helpers;


public class Time{
    private Time(){}

    public static void waiting(int waiting) {
        try {
            Thread.sleep(Long.parseLong(String.valueOf(waiting)));
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
