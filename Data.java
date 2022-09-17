
public class Data {
    private static Data dobj;
    private Data(){
    }
   
        public static Data getInstance(){
            // create object if it's not already created
            if(dobj==null){
                dobj=new Data();
            }
            // return the sigleton object
            return dobj;
        }
        public void getConnection(){
            System.out.println("you are now connected to th Data");
        }
}

class Main{
    public static void main(String[] args) {
        Data db1;
        // refer to the only object of Data
        db1=Data.getInstance();
        db1.getConnection();
    }
}
