package io.patterns.multiple.duck;

import io.patterns.multiple.observer.ObservableDuck;

public interface Duck extends ObservableDuck {
    String quack();
}
