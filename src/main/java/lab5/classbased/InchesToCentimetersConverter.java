package lab5.classbased;

public class InchesToCentimetersConverter extends LengthConverter {

    public void setLength(double length){
        super.length = length;
    }

    @Override
    public double convert() {
        return super.length / 0.39370;
    }
}
