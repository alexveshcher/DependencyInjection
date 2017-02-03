package groupid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/Beans.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        Foo f = (Foo) context.getBean("foo");
        f.foo_void();
    }
}