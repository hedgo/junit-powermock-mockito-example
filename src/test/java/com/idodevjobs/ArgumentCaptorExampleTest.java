package com.idodevjobs;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorExampleTest {

    @Mock
    private ArgumentCaptorExampleDependent argumentCaptorExampleDependent;

    private ArgumentCaptorExample argumentCaptorExample;

    @Before
    public void setUp() throws Exception {
        argumentCaptorExample = new ArgumentCaptorExample();
        argumentCaptorExample.setArgumentCaptorExampleDependent(argumentCaptorExampleDependent);
    }

    @Test
    public void testDoSomething() throws Exception {
        argumentCaptorExample.doSomething("TEST_INPUT");
        ArgumentCaptor<ArgumentCaptorExampleRequest> argument = ArgumentCaptor.forClass(ArgumentCaptorExampleRequest.class);
        verify(argumentCaptorExampleDependent).helpDoSomething(argument.capture());
        assertEquals("TEST_INPUT", argument.getValue().getInput());
    }
}
