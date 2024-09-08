public class Driver
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        System.out.println(deck);

        Card card = new Card(14,3);
        System.out.println(card);
        System.out.println(deck.deal());
        System.out.println(deck);
    }
}
