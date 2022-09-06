package BulletsCreator.Patterns;

import BulletsCreator.Bullet;
import BulletsCreator.Color;
import BulletsCreator.Vector3D;

import java.util.ArrayList;

public class ChainOfResponsibilityPattern {


    private class BulletClass extends Bullet{

    }
    private abstract class AddClass{
        protected abstract void handleRequest(Bullet bullet);
    }

    private class addShape extends AddClass{

        @Override
        protected void handleRequest(Bullet bullet) {

            double someDouble = 0;
            if (true){//should be something
                bullet.setHeight(someDouble);
                bullet.setLength(someDouble);
                bullet.setWidth(someDouble);
            }
        }
    }
    private class addWeight extends AddClass{

        @Override
        protected void handleRequest(Bullet bullet) {
            double someDouble = 0;
            if (true){//should be something
                bullet.setWeight(someDouble);
            }
        }
    }
    private class addColor extends AddClass{

        @Override
        protected void handleRequest(Bullet bullet) {
            int someInt = 0;
            if (true){//should be something
                bullet.setColor(new Color(someInt,someInt,someInt));
            }
        }
    }
    private class addVector extends AddClass{

        @Override
        protected void handleRequest(Bullet bullet) {
            double someDouble = 0;
            if (true){//should be something
                bullet.setVector(new Vector3D(someDouble,someDouble,someDouble));
            }
        }
    }
    public Bullet makeBullet(){
        ArrayList<AddClass> list = new ArrayList();
        list.add(new addShape());
        list.add(new addWeight());
        list.add(new addColor());
        list.add(new addVector());

        BulletClass bullet = new BulletClass();

        for (int i = 0; i < list.size();i++){
            list.get(i).handleRequest(bullet);
        }
        return bullet;
    }
}
