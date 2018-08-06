package quoters;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {


    @InjectRandomInt(min = 2, max = 7)
    private int repeate;
    private String message;

    @PostConstruct
    public void init(){
        System.out.println("phase 2 - " + repeate);
    }
    public TerminatorQuoter() {
        System.out.println("phase 1 - " + repeate);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
//    @PostProxy
    public void sayQuote() {
        System.out.println("phase 3");
        for(int i = 0; i < repeate; i++){
            System.out.println("message = " + message);
        }
    }
}
