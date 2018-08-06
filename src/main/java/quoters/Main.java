package quoters;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws InterruptedException {
        LOG.info("Logger test");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

    }
}
