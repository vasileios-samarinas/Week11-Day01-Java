public class WaterBottle {
 private double volume;
 private int waterPortion=10;

 public WaterBottle(double volume){
     this.volume=volume;
 }

 public double getVolume(){
     return this.volume;
 }

 public void drinkWater(){
     this.volume = this.volume-waterPortion;
 }

 public double empty(){
     return this.volume-= this.volume;
 }

}
