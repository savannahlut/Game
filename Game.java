import java.util.Scanner;

public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    /** Postcondition: All instance variables have been initialized. */
    public Game()
    {
        levelOne = new Level(false, 0);
        levelTwo = new Level(false, 0);
        levelThree = new Level(false, 0);
        bonus = false;
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        return bonus;
    }

    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
    * game data
    */
    public void play()
    {
        System.out.println("Enter the number of points:");
        Scanner s = new Scanner(System.in);
        levelOne.setGoal(true);
        levelOne.setPoints(s.nextInt());
        levelTwo.setPoints(0);
        levelThree.setPoints(0);
    }

    public void play(boolean one, boolean two, boolean three, boolean bonus)
    {
        levelOne.setPoints(200);
        levelOne.setGoal(one);

        levelTwo.setPoints(100);
        levelTwo.setGoal(two);

        levelThree.setPoints(500);
        levelThree.setGoal(three);

        this.bonus = bonus;
    }

    public int getScore()
    {
        int score = 0; 
        if(levelOne.goalReached()) {
            score += levelOne.getPoints();
            if(levelTwo.goalReached()){
                score += levelTwo.getPoints();
                if(levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }
        if(isBonus()) score *= 3;
        return score;
    }

    /** Simulates the play of num games and returns the highest score earned, as
    * described in part (b)
    * Precondition: num > 0
    */
    public int playManyTimes(int num)
    { 
        int best = 0;
        for(int i = 0; i < num; i++){
            play();
            int newScore = getScore();
            if(newScore > best) best = newScore;
        }
        return best;
    }

}