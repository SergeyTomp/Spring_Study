package quoters;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class JavaConfig {

//    @Bean
//    public PostProxyInvokerContextListener postProxyInvokerContextListener () {
//        return new PostProxyInvokerContextListener();
//    }

    @Bean
    public ProfilingController profilingController (){
        ProfilingController controller =  new ProfilingController();
        controller.setEnabled(true);
        return controller;
    }

    @Bean
    public ProfilingHandlerBeanPostProcessor profilingHandlerBeanPostProcessor() throws Exception {
        return new ProfilingHandlerBeanPostProcessor(profilingController());
    }
    @Bean(name = "terminatorQuoter")
    public TerminatorQuoter terminatorQuoter(){
        TerminatorQuoter terminatorQuoter = new TerminatorQuoter();
        terminatorQuoter.setMessage("I'll be back");
        return terminatorQuoter;
    }
    @Bean
        public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor (){
            return new InjectRandomIntAnnotationBeanPostProcessor();
    }
}
