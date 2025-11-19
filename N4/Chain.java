package N4;



public abstract class Chain implements Handler {

    private Handler  next;

    @Override
    public void setNext(Handler  next) {
        this.next = next;
    }

    @Override
    public void validate(Transaction transaction) {
        if (process(transaction)) {
            if (next != null) {
                next.validate(transaction);
            }
        } else {
            throw new RuntimeException("Transação barrada por: " + this.getClass().getSimpleName());
        }
    }


    protected abstract boolean process(Transaction transaction);
}
