package org.seariver.actor;

import com.badlogic.gdx.scenes.scene2d.Stage;
import org.seariver.BaseActor;

public class Enemy extends BaseActor {

    public Enemy(float x, float y, Stage s) {

        super(x, y, s);

        String[] filenames = {"planeRed0.png", "planeRed1.png", "planeRed2.png", "planeRed1.png"};
        loadAnimationFromFiles(filenames, 0.1f, true);

        setSpeed(100);
        setMotionAngle(180);
        setBoundaryPolygon(8);
    }

    public void act(float dt) {
        super.act(dt);
        applyPhysics(dt);
    }
}
