package lessons.basics;

public class C51_Enumerations {

    enum Direction {
        // The values
        North(0),
        South (180),
        East(90),
        West (270);

        private  int degrees;

        Direction(int degrees) {
            this.degrees = degrees;
        }

        public int Degrees() { return this.degrees; }
    }

    public static void main(String[] args) {
        // Demo of Enumerations in Java
        // d is "North"
        Direction d = Direction.North;

        // Print d
        System.out.printf("%s is at %d degrees.\n",d,d.Degrees());
        // Print East
        System.out.printf("%s is at %d degrees.\n",Direction.East,Direction.East.Degrees());


    }

}
