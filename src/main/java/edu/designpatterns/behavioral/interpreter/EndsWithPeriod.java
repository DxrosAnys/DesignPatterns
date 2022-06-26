package edu.designpatterns.behavioral.interpreter;

public class EndsWithPeriod implements Expresion {

    private final FirstLetterLowerCase firstLetterLowerCase = new FirstLetterLowerCase();

    @Override
    public String interpret(String context) {
        if(!context.endsWith(".")) {
            context = context + ".";
        }
        return firstLetterLowerCase.interpret(context);
    }
}
