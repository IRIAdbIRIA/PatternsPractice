package BulletsCreator.Patterns;

import BulletsCreator.Bullet;
import BulletsCreator.Color;
import BulletsCreator.Vector3D;

public class BuilderPattern {

    private class BulletClass extends Bullet {

        private void initializeHeight(double height){
            setHeight(height);
        }

        private void initializeWeight(double weight){
            setWeight(weight);
        }

        private void initializeLength(double length){
            setLength(length);
        }

        private void initializeWidth(double width){
            setWidth(width);
        }

        private void initializeColor(Color color){
            setColor(color);
        }

        private void initializeVector(Vector3D vector){
            setVector(vector);
        }
    }

    public Bullet makeBullet(){

        BulletClass bullet = new BulletClass();

        double someDouble = 0;
        int someInt = 0;

        if (true) {//should be something

            bullet.initializeHeight(someDouble);
            bullet.initializeWidth(someDouble);
            bullet.initializeLength(someDouble);
        }
        if (true){//should be something
            bullet.initializeWeight(someDouble);
        }
        if (true){//should be something
            bullet.initializeVector(new Vector3D(someDouble,someDouble,someDouble));
        }
        if (true){//should be something
            bullet.initializeColor(new Color(someInt,someInt,someInt));
        }
        return bullet;
    }
}
