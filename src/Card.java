import java.util.Objects;

public class Card {
    private String mast;
    private String nominal;
    private int value;

    public Card() {
    }

    public Card(String mast, String nominal, int value) {
        this.mast = mast;
        this.nominal = nominal;
        this.value = value;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value &&
                Objects.equals(mast, card.mast) &&
                Objects.equals(nominal, card.nominal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mast, nominal, value);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "msst='" + mast + '\'' +
                ", nominal='" + nominal + '\'' +
                ", value=" + value +
                '}';
    }
}
