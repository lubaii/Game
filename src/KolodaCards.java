import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class KolodaCards {
    private ArrayList<Card>  cards = new ArrayList<>(); // карты лежат в этой переменной

    public KolodaCards() {
    }
    public void init() {// подготовка карт
        cards.add(new Card("Пика","2",2));
        cards.add(new Card("Трефа","2",2));
        cards.add(new Card("Бубна","2",2));
        cards.add(new Card("Черви","2",2));

        cards.add(new Card("Пика","3",3));
        cards.add(new Card("Трефа","3",3));
        cards.add(new Card("Бубна","3",3));
        cards.add(new Card("Черви","3",3));

        cards.add(new Card("Пика","4",4));
        cards.add(new Card("Трефа","4",4));
        cards.add(new Card("Бубна","4",4));
        cards.add(new Card("Черви","4",4));

        cards.add(new Card("Пика","5",5));
        cards.add(new Card("Трефа","5",5));
        cards.add(new Card("Бубна","5",5));
        cards.add(new Card("Черви","5",5));

        cards.add(new Card("Пика","6",6));
        cards.add(new Card("Трефа","6",6));
        cards.add(new Card("Бубна","6",6));
        cards.add(new Card("Черви","6",6));

        cards.add(new Card("Пика","7",7));
        cards.add(new Card("Трефа","7",7));
        cards.add(new Card("Бубна","7",7));
        cards.add(new Card("Черви","7",7));

        cards.add(new Card("Пика","8",8));
        cards.add(new Card("Трефа","8",8));
        cards.add(new Card("Бубна","8",8));
        cards.add(new Card("Черви","8",8));

        cards.add(new Card("Пика","9",9));
        cards.add(new Card("Трефа","9",9));
        cards.add(new Card("Бубна","9",9));
        cards.add(new Card("Черви","9",9));

        cards.add(new Card("Пика","10",10));
        cards.add(new Card("Трефа","10",10));
        cards.add(new Card("Бубна","10",10));
        cards.add(new Card("Черви","10",10));

        cards.add(new Card("Пика","11",11));
        cards.add(new Card("Трефа","11",11));
        cards.add(new Card("Бубна","11",11));
        cards.add(new Card("Черви","11",11));


    }
    public Card getRundomCard(){
        int randomNun = ThreadLocalRandom.current().nextInt(0,51+1);
        return cards.get(randomNun);
    }
}
