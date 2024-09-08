public class Card
{
    public int rank, suit;

    private String[] suits = {"♥", "♦", "♣", "♠"};

    /**
     * Precondition: 2 <= rank <= 14
     *               0 <= suit <= 3
     *
     *
     * @param rank
     * @param suit
     */
    public Card(int rank, int suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank()
    {
        return rank;
    }

    public int getSuit()
    {
        return suit;
    }

    /**
     * @return the Blackjack value of this card
     *          [2, 10] --> rank
     *          [J, K] --> 10
     *          A --> 11
     */
    public int getValue()
    {
        if(rank <= 10)
            return rank;

        if(rank <= 13)
            return 10;

        return 11;
    }

    /**
     * @return a String representation of this Card
     *          in the format ranksuit.
     *
     *          Examples:
     *          A♥♦♣♠
     */
    public String toString()
    {
        return ranks[rank] + suits[suit];
    }
}
