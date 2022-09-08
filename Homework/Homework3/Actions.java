package Homework.Homework3;

import java.util.ArrayList;

public interface Actions {

void step(ArrayList<BaseHero> target, ArrayList<BaseHero> ours);

String getShortInfo();                 // вернуть состояние

}
