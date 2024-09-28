package lld.lld2.PrototypeAndRegistry.V1;

public class IntelligentStudent extends Student {
    int iq;
    public  IntelligentStudent Copy(){
        IntelligentStudent copy = new IntelligentStudent();
        copy.iq = this.iq;
        copy.id=this.id;
        copy.name=this.name;
        copy.batch=this.batch;
        return copy;
    }

}
