package ExcpetionInheritance;

public class Delivery {

    public Beans Messenger(int amount, int quantity, boolean thereIsNoBeans) throws BeansBusinessException{
        if(thereIsNoBeans) throw new BeansIsFinishedException("Oga beans done finsih");
        return new Beans("Akin", quantity, amount);

    }
}
