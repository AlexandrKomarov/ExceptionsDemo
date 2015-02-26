package jv.curse;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
 * Date: 26.02.15
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public class NullPointer extends Exception {
    private String messege;

    public NullPointer(String s) {
        messege = s;
    }


    public String getMessege() {
        return messege;
    }
}
