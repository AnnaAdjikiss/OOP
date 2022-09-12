package Homework.Homework4;

import java.util.List;

public interface Actions {

void step(List<BaseHero> target, List<BaseHero> ours);
String returnCondition();
String getShortInfo();                 // вернуть состояние
Coordinates getPosition();
}
