package demo;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff{
    public void assist(){
        System.out.println("Nurse assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;
}
