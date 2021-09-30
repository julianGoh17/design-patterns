package io.patterns.facade;

import io.patterns.facade.system.Projector;
import io.patterns.facade.system.SoundSystem;
import io.patterns.facade.system.TheatreLight;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HomeTheatreFacadeTest {
    @Test
    public void TestInit() {
        HomeTheatreFacade facade = initializeFacade();
        Assert.assertNotNull(facade.getTheatreLight());
        Assert.assertNotNull(facade.getSoundSystem());
        Assert.assertNotNull(facade.getProjector());
    }

    @Test
    public void TestTurnOnMovie() {
        HomeTheatreFacade facade = initializeFacade();
        facade.turnOnMovie();
        Assert.assertEquals(HomeTheatreFacade.MOVIE, facade.getProjector().getDvd());
        Assert.assertTrue(facade.getProjector().isEnabled());
        Assert.assertEquals(HomeTheatreFacade.MOVIE_VOLUME, facade.getSoundSystem().getVolume());
        Assert.assertTrue(facade.getSoundSystem().isEnabled());
        Assert.assertEquals(HomeTheatreFacade.MOVIE_LUMINOSITY, facade.getTheatreLight().getLuminosity(), 0);
        Assert.assertTrue(facade.getTheatreLight().isEnabled());
    }

    @Test
    public void TestTurnOffMovie() {
        HomeTheatreFacade facade = initializeFacade();
        facade.turnOnMovie();
        facade.turnOffMovie();
        assertDisabledSystem(facade);
    }

    @Test
    public void TestTurnOnMusic() {
        HomeTheatreFacade facade = initializeFacade();
        facade.turnOnMusic();
        Assert.assertEquals(HomeTheatreFacade.MUSIC, facade.getProjector().getDvd());
        Assert.assertTrue(facade.getProjector().isEnabled());
        Assert.assertEquals(HomeTheatreFacade.MUSIC_VOLUME, facade.getSoundSystem().getVolume());
        Assert.assertTrue(facade.getSoundSystem().isEnabled());
        Assert.assertEquals(HomeTheatreFacade.MUSIC_LUMINOSITY, facade.getTheatreLight().getLuminosity(), 0);
        Assert.assertTrue(facade.getTheatreLight().isEnabled());
    }

    @Test
    public void TestTurnOffMusic() {
        HomeTheatreFacade facade = initializeFacade();
        facade.turnOnMusic();
        facade.turnOffMusic();
        assertDisabledSystem(facade);
    }

    private void assertDisabledSystem(HomeTheatreFacade facade) {
        Assert.assertNull(facade.getProjector().getDvd());
        Assert.assertFalse(facade.getProjector().isEnabled());
        Assert.assertEquals(0, facade.getSoundSystem().getVolume());
        Assert.assertFalse(facade.getSoundSystem().isEnabled());
        Assert.assertEquals(0, facade.getTheatreLight().getLuminosity(), 0);
        Assert.assertFalse(facade.getTheatreLight().isEnabled());
    }

    private HomeTheatreFacade initializeFacade() {
        return new HomeTheatreFacade(new TheatreLight(), new SoundSystem(), new Projector());
    }
}
