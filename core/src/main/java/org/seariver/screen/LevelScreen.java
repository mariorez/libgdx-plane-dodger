package org.seariver.screen;

import org.seariver.BaseScreen;
import org.seariver.actor.Ground;
import org.seariver.actor.Sky;

public class LevelScreen extends BaseScreen {

    public void initialize() {
        new Sky(0, 0, mainStage);
        new Sky(800, 0, mainStage);
        new Ground(0, 0, mainStage);
        new Ground(800, 0, mainStage);
    }

    public void update(float dt) {
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
