package demo;

//life cycle of a Bean
//7 steps
//def of a bean- define all beans needed to create
//instantiate those beans
//        populate those property
//        post initialization-- aware interfaces will be executed- custom execution will be executed
//        Bean rerady to serve now-- available in container
//        pre destroy the Bean- cleanup--(release connections, close file, delete data)
//        Bean destroyed where bean is destroyed from JVM itself.





import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
}
