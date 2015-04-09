package com.idodevjobs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class DeepStubExampleTest {

    @Mock (answer = Answers.RETURNS_DEEP_STUBS)
    private DeepStubDependent deepStubDependent;

    @Test
    public void testMethodUnderTest() {
        DeepStubExample deepStubExample = new DeepStubExample();
        deepStubExample.setDeepStubDependent(deepStubDependent);
        given(deepStubDependent.getDeepStubDependentDependent().getMessage(anyString())).willReturn("some text");
        String output = deepStubExample.methodUnderTest("test");
        assertEquals("some text", output);
    }
}
