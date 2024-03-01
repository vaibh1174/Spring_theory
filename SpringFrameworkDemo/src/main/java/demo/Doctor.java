package demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doc assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("calling bean name method");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");
    }
}
