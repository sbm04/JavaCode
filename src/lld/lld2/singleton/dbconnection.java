package lld.lld2.singleton;

public class dbconnection {
    private static volatile dbconnection dbconnInstance = null;

    private dbconnection(){

    }
    public static  dbconnection getDbconnInstance(){
        if(dbconnInstance==null){
            synchronized (dbconnection.class){
                if(dbconnInstance==null){
                  dbconnInstance= new dbconnection();
                }
            }
        }
        return dbconnInstance;
    }
}
