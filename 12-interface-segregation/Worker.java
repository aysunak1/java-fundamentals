public class Worker implements IWorkable ,IEatable,IPayable{

    @Override
    public void work() {
        System.out.println("8 saat çalışma");

    }

    @Override
    public void eat() {
        System.out.println("Yemek hakkı vardır.");
    }

    @Override
    public void pay() {
        System.out.println("Maaş ödenecek.");

    }
}
