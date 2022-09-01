package OOP.Homework.Homework1;

public class Program {
    public static void main(String[] args) {
        Peasant[] peasants = new Peasant[5];
        Outlaw [] outlaws = new Outlaw[5];
        Sniper [] snipers = new Sniper[5];
        Warlock[] warlocks = new Warlock[5];
        Spearman [] spearmen = new Spearman[5];
        Crossbowman [] crossbowmen = new Crossbowman[5];
        Monk[] monks = new Monk[5];

        for (int i = 0; i < 5; i++) {
            peasants[i] = new Peasant();
            outlaws[i] = new Outlaw();
            snipers[i] = new Sniper();
            warlocks[i] = new Warlock();
            spearmen[i] = new Spearman();
            crossbowmen[i] = new Crossbowman();
            monks[i] = new Monk();
            
            System.out.println(peasants[i].getInfo());
            System.out.println(outlaws[i].getInfo());
            System.out.println(snipers[i].getInfo());
            System.out.println(warlocks[i].getInfo());
            System.out.println(spearmen[i].getInfo());
            System.out.println(crossbowmen[i].getInfo());
            System.out.println(monks[i].getInfo());
            System.out.println("------------------------------------------------------");
        }
        
        
    }
}
