package charsequence;

public class Gnirts implements CharSequence {
    String s;

    public Gnirts(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return s.charAt(s.length()-(index+1));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}

