package ExcpetionInheritance;

public class MoneyIsBadException extends BeansBusinessException {
    public MoneyIsBadException(String message) {
        super(message);
    }
}
