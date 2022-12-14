package jh.parser.exeptions;

public class WrongNumberOfArgsException extends RuntimeException{

    private static final String MSG = "Expected %d args but got %s args.";
    private final int expected, provided;

    public WrongNumberOfArgsException(int expected, int provided){
        super(String.format(MSG, expected, provided));
        this.expected = expected;
        this.provided = provided;
    }

    int expectedArgs(){
        return expected;
    }

    int provided(){
        return provided;
    }

}
