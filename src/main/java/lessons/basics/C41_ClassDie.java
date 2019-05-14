package lessons.basics;

import java.util.Random;

public class C41_ClassDie {

    private int _sides;
    private int _value;
    private Random _generator;

    // this is the contructor, called when you "new" the class.
    public C41_ClassDie(int sides) {
        this._sides  = sides;
        this._generator = new Random();
        this.roll();    // roll it so it gets a value.
    }

    // overload, to pass in an existing seed
    public C41_ClassDie(int sides, int seed) {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll();    // roll it so it gets a value.
    }

    // get the number of sides on the die
    public int getSides() {
        return _sides;
    }

    // change the number of sides on the die
    public int setSides(int sides) {
        this._sides = sides;
        return _sides;
    }

    // simulates a dice roll
    public int roll() {
        _value = _generator.nextInt(_sides)+1;
        return _value;
    }

    // get value showing on die
    public int getValue()
    {
        return _value;
    }
}
