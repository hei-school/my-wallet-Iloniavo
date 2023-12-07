public class Transaction {
    private Double value;
    private String type;

    private String reason;

    public Transaction(String type, Double value, String reason){
        this.reason = reason;
        this.value = value;
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public String getReason() {
        return reason;
    }

    public String getType() {
        return type;
    }
}
