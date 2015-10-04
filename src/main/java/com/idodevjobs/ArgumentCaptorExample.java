package com.idodevjobs;

public class ArgumentCaptorExample {
    ArgumentCaptorExampleDependent argumentCaptorExampleDependent;

    public void doSomething(String input) {
        ArgumentCaptorExampleRequest argumentCaptorExampleRequest = new ArgumentCaptorExampleRequest(input);
        argumentCaptorExampleDependent.helpDoSomething(argumentCaptorExampleRequest);
    }

    public void setArgumentCaptorExampleDependent(ArgumentCaptorExampleDependent argumentCaptorExampleDependent) {
        this.argumentCaptorExampleDependent = argumentCaptorExampleDependent;
    }
}

class ArgumentCaptorExampleDependent {
    public void helpDoSomething(ArgumentCaptorExampleRequest argumentCaptorExampleRequest) {
        System.out.println("helpDoSomething");
    }
}

class ArgumentCaptorExampleRequest {
    private String input;

    public ArgumentCaptorExampleRequest(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
