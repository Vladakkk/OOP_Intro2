public class Cat extends Animals{
    private static int catCount = 0;
    private static final int MaxRunDist = 200;

    public Cat(){
        catCount++;
    }

    public void run(int distance){
        if (distance <= MaxRunDist){
            super.run(distance);
        } else {
            System.out.println("The cat can't run more than " + MaxRunDist + " m");
        }
    }

    public void swim(int distance){
        System.out.println("The cat can't swim");
    }

    public static int getCatCount(){
        return catCount;
    }
}
