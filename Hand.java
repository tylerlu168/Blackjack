import java.util.ArrayList;

public class Hand
{

        private ArrayList<Card> cards;

        public Hand()
        {
            cards = new ArrayList<Card>();
        }

        /**
         * Adds card to this hand
         * @param card
         */
        public void hit(Card card)
        {
            cards.add(card);
        }

        public String toString()
        {
            return cards + "";
        }

}