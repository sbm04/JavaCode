package lld.lld2.PrototypeAndRegistry.V2;

public class IntelligentStudent extends Student {
    int iq;
    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }
    public  IntelligentStudent Copy(){
        IntelligentStudent copy = new IntelligentStudent(this);
        return copy;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
