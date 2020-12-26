package org.seariver.screen;

import com.badlogic.gdx.Input.Keys;
import org.seariver.BaseActor;
import org.seariver.BaseScreen;
import org.seariver.actor.Ground;
import org.seariver.actor.Plane;
import org.seariver.actor.Sky;

public class LevelScreen extends BaseScreen {

    Plane plane;

    public void initialize() {

        new Sky(0, 0, mainStage);
        new Sky(800, 0, mainStage);
        new Ground(0, 0, mainStage);
        new Ground(800, 0, mainStage);

        plane = new Plane(100, 500, mainStage);
        BaseActor.setWorldBounds(800, 600);
    }

    public void update(float deltaTime) {
    }

    public boolean keyDown(int keyCode) {

        if (keyCode == Keys.SPACE)
            plane.boost();

        return true;
    }
}
