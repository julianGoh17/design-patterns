package io.patterns.facade;

import io.patterns.facade.system.Projector;
import io.patterns.facade.system.SoundSystem;
import io.patterns.facade.system.TheatreLight;

public class HomeTheatreFacade {
    public final static String MOVIE = "The Bee Movie";
    public final static double MOVIE_LUMINOSITY = 0.1;
    public final static int MOVIE_VOLUME = 10;

    public final static String MUSIC = "Loco - ITZY";
    public final static double MUSIC_LUMINOSITY = 0.5;
    public final static int MUSIC_VOLUME = 85;


    private final TheatreLight theatreLight;
    private final SoundSystem soundSystem;
    private final Projector projector;

    public HomeTheatreFacade(TheatreLight theatreLight, SoundSystem soundSystem, Projector projector) {
        this.theatreLight = theatreLight;
        this.soundSystem = soundSystem;
        this.projector = projector;
    }

    public TheatreLight getTheatreLight() {
        return theatreLight;
    }

    public SoundSystem getSoundSystem() {
        return soundSystem;
    }

    public Projector getProjector() {
        return projector;
    }

    public void turnOnMovie() {
        enableSystem(MOVIE, MOVIE_VOLUME, MOVIE_LUMINOSITY);
    }

    public void turnOffMovie() {
        resetSystem();
    }

    public void turnOnMusic() {
        enableSystem(MUSIC, MUSIC_VOLUME, MUSIC_LUMINOSITY);
    }

    public void turnOffMusic() {
        resetSystem();
    }

    private void enableSystem(String dvd, int volume, double luminosity) {
        setSystemComponents(dvd, volume, luminosity, true);
    }

    private void resetSystem() {
        setSystemComponents(null, 0, 0, false);
    }

    private void setSystemComponents(String dvd, int volume, double luminosity, boolean isEnabled) {
        projector.setDvd(dvd);
        projector.setEnabled(isEnabled);
        soundSystem.setVolume(volume);
        soundSystem.setEnabled(isEnabled);
        theatreLight.setLuminosity(luminosity);
        theatreLight.setEnabled(isEnabled);
    }
}
