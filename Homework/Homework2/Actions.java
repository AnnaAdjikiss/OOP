package Homework.Homework2;

public interface Actions {

void hit(BaseHero target);             // ударить

void getHit(int damage);               // получить повреждение

String getStatus();                    // вернуть статус

void move (float x, float y);          // переместиться

String getShortInfo();                 // вернуть состояние

}
