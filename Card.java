public class Card {
    private String name;
    private String type;
    private boolean isIn;

    public Card(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setIn(boolean isIn) {
        this.isIn = isIn;
    }
}