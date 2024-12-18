public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /** Postcondition: All instance variables have been initialized. */
    public Game()
    { /* implementation not shown */ }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    { /* implementation not shown */ }

    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
    * game data
    */
    public void play()
    { /* implementation not shown */ }

    public int getScore()
    {
        int score = 1; 
        if(levelOne.goalReached()) score += levelOne.getPoints();
        if(levelTwo.goalReached()) score += levelTwo.getPoints();
        if(levelThree.goalReached()) score += levelThree.getPoints();
        if(isBonus()) score *= 3;
        return score; 
    }

    /** Simulates the play of num games and returns the highest score earned, as
    * described in part (b)
    * Precondition: num > 0
    */
    public int playManyTimes(int num)
    { 
        play();
        int best = getScore();
        for(int i = 2; i <= num; i++){
            play();
            int newScore = getScore();
            if(newScore > best) best = newScore;
        }
        return best;
    }

}