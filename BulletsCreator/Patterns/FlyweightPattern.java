package BulletsCreator.Patterns;

import BulletsCreator.Color;
import BulletsCreator.Vector3D;

import java.util.ArrayList;

public class FlyweightPattern {

    ArrayList<BulletUnit> bulletUnits = new ArrayList<>();

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

    public FlyweightPattern(){
        updateUnitsIfNeeded();
    }

    public class BulletFromStates{
        private BulletUnit bulletUnit;
        private Vector3D vector;

        public BulletFromStates(BulletUnit bulletUnit, Vector3D vector) {
            this.bulletUnit = bulletUnit;
            this.vector = vector;
        }

        public BulletUnit getBulletUnit() {
            return bulletUnit;
        }

        public Vector3D getVector() {
            return vector;
        }
    }

    public BulletFromStates makeBullets(){
        int someInt = 0;
        double someDouble = 0;
        return new BulletFromStates(bulletUnits.get(someInt),new Vector3D(someDouble,someDouble,someDouble));
    }

    private void updateUnitsIfNeeded(){
        double someDouble = 0;
        int someInt = 0;
        for (int i = 0; i < someInt;i++) {
            if (true) {//should be something
                bulletUnits.add(new BulletUnit(someDouble, someDouble, someDouble, someDouble, new Color(someInt, someInt, someInt)));
            }
        }
    }
}
