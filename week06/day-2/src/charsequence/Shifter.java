package charsequence;

public class Shifter implements CharSequence {
    String s;
    int n;

    public Shifter(String s, int n) {
        this.s = s;
        this.n = n;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        if(this.n + index > s.length()-1){
            return s.charAt((index+n) % s.length());
        } else {
            return s.charAt(index+n);
        }
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
