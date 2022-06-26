package edu.designpatterns.behavioral.interpreter;

public class FirstLetterLowerCase implements Expresion {

   private final NoRepeatedWords endsWithPeriod = new NoRepeatedWords();

    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toUpperCase() + context.substring(1);
        return endsWithPeriod.interpret(context);
    }
}
