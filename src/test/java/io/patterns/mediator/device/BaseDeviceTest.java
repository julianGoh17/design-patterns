package io.patterns.mediator.device;

import org.junit.Assert;

public abstract class BaseDeviceTest {
    protected void AssertMethodThrowsUnsupportedOperation(Runnable function) {
        try {
            function.run();
            Assert.fail();
        } catch (UnsupportedOperationException e) {
            Assert.assertNotNull(e);
        }
    }
}
