public class Main {
    public static void main(String[] args) {

//        BaseLogger[] baseLoggers = new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new FileLogger()};
//        for (BaseLogger logger : baseLoggers){
//            logger.Log("Loglandı...");
//        }
        CustomerManager customerManager= new CustomerManager(new FileLogger());
        customerManager.Add();


    }
}
