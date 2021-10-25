package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String someTextToDecorate, PoemDecorator decorator) {
        String result = decorator.decorate(someTextToDecorate);
        System.out.println(result);
    }

}