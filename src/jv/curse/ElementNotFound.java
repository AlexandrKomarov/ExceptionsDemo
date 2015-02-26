package jv.curse;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
 * Date: 26.02.15
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */
public class ElementNotFound extends Exception {
    private String messege;

    public ElementNotFound(String s) {
        messege = s;
    }


    public String getMessege() {
        return messege;
    }
}
