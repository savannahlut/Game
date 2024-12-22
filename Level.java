public class Level
{
    private boolean goal;
    private int points;

    public Level(boolean goal, int points){
        this.goal = goal;
        this.points = points;
    }

    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    {
        return goal;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    {
        return points;
    }

    public void setGoal(boolean goal){
        this.goal = goal;
    }

    public void setPoints(int points){
        this.points = points;
    }
}