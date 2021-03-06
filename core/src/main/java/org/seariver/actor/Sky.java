package org.seariver.actor;

import com.badlogic.gdx.scenes.scene2d.Stage;
import org.seariver.BaseActor;

public class Sky extends BaseActor {

    public Sky(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("sky.png");
        setSpeed(25);
        setMotionAngle(180);
    }

    public void act(float deltaTime) {

        super.act(deltaTime);

        applyPhysics(deltaTime);

        // if moved completely past left edge of screen:
        // shift right, past other instance.
        if (getX() + getWidth() < 0) {
            moveBy(2 * getWidth(), 0);
        }
    }
}
