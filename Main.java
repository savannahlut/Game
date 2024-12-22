public class Main 
{
    public static void main(String[] args)
    {
        Game mario = new Game();
        mario.play(true, true, true, true);
        System.out.println(mario.getScore());

        Game peach = new Game();
        peach.play(true, true, false, false);
        System.out.println(peach.getScore());

        Game luigi = new Game();
        luigi.play(true, false, true, true);
        System.out.println(luigi.getScore());

        Game daisy = new Game();
        daisy.play(false, true, true, false);
        System.out.println(daisy.getScore());

        Game Rosalina = new Game();

        System.out.println(Rosalina.playManyTimes(4));
    }
}