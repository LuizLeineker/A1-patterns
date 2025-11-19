package N4;

public interface Handler {
    void setNext(Handler next);
    void validate(Transaction transaction);
}
