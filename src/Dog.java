public class Dog extends Animals{
    private static int dogCount = 0;
    private static int totalDist = 0;
    private static final int MaxRunDist = 500;
    private static final int MaxSwimDist = 10;

    public Dog(){
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MaxRunDist){
            super.run(distance);
            totalDist += distance;
        } else {
            System.out.println("The dog can't run more than " + MaxRunDist + " m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MaxSwimDist){
            super.swim(distance);
        } else {
            System.out.println("the dog can't swim over than " + MaxSwimDist + " m");
        }
    }

    public static int getDogCount(){
        return dogCount;
    }

    public static int getTotalDist(){
        return totalDist;
    }
}
