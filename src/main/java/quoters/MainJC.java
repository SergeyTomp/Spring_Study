package quoters;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJC {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

            ctx.getBean(Quoter.class).sayQuote();
    }
}
