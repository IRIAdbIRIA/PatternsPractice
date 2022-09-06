package BulletsCreator.Patterns;

import BulletsCreator.Color;
import BulletsCreator.Vector3D;

import java.util.ArrayList;

public class FlyweightPattern {

    ArrayList<BulletUnit> bulletUnits = new ArrayList<>();
    ArrayList<MovingBullet> movingBullets = new ArrayList<>();

    private class BulletUnit{
        private double weight;
        private double height;
        private double length;
        private double width;
        private Color color;

        private BulletUnit(double weight, double height, double length, double width, Color color) {
            this.weight = weight;
            this.height = height;
            this.length = length;
            this.width = width;
            this.color = color;
        }
    }
    private class MovingBullet{
        private Vector3D vector;

        private MovingBullet(Vector3D vector) {
            this.vector = vector;
        }
    }

    public FlyweightPattern(){
        updateUnitsIfNeeded();
    }

    public class BulletFromStates{
        private BulletUnit bulletUnit;
        private MovingBullet movingBullet;

        public BulletFromStates(BulletUnit bulletUnit, MovingBullet movingBullet) {
            this.bulletUnit = bulletUnit;
            this.movingBullet = movingBullet;
        }

        public BulletUnit getBulletUnit() {
            return bulletUnit;
        }

        public MovingBullet getMovingBullet() {
            return movingBullet;
        }
    }

    public BulletFromStates makeBullets(){
        int someInt = 0;
        return new BulletFromStates(bulletUnits.get(someInt),movingBullets.get(someInt));
    }

    private void updateUnitsIfNeeded(){
        double someDouble = 0;
        int someInt = 0;
        for (int i = 0; i < someInt;i++) {
            if (true) {//should be something
                bulletUnits.add(new BulletUnit(someDouble, someDouble, someDouble, someDouble, new Color(someInt, someInt, someInt)));
            }
            if (true) {//should be something
                movingBullets.add(new MovingBullet(new Vector3D(someDouble, someDouble, someDouble)));
            }
        }
    }
}
