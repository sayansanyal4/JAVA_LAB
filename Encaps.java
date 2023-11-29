class data_share{
    private String id;
    public String share(){
        id = "GNIT/2021/0413";
        return id;
    }
}

public class Encaps {
    public static void main(String[] args) {
        data_share data1 = new data_share();
        data1.share();
        System.out.println("The ID is : "+data1.share());
    }
    
}
