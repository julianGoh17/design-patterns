package io.patterns.mvc.controller;

import io.patterns.mvc.model.DJBeatModel;
import org.junit.jupiter.api.Test;

public class DJControllerTest {
    @Test
    public void TestDJController() {
        Controller controller = new DJController(new DJBeatModel());
    }
}
