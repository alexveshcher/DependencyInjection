package groupid;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alex on 2/2/17.
 */
public class Foo {
    @Autowired
    private Bar bar;


//    public void setBar(Bar bar){
//        this.bar = bar;
//    }

    public Bar getBar(){
        return bar;
    }

    public void foo_void(){
        bar.bar_void();
    }
}
