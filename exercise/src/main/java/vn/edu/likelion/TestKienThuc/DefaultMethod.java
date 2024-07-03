package vn.edu.likelion.TestKienThuc;
/**
 * DefaultMethod -
 *
 * @param
 * @return
 * @throws
 */


interface Interface1{
    default void doSomthing(){

    }
}
interface Interface2{
    // default void doSomthing(){
    //
    // }
    void doSomthing();
}
public class DefaultMethod implements Interface1,Interface2{
    @Override
    public void doSomthing() {
        System.out.println("phuc");
    }

    public static void main(String[] args) {
        DefaultMethod de = new DefaultMethod();
        de.doSomthing();
    }

}
