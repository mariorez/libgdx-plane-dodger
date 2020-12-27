package org.seariver.actor;

import com.badlogic.gdx.scenes.scene2d.Stage;
import org.seariver.BaseActor;

public class Explosion extends BaseActor {

    public Explosion(float x, float y, Stage s) {
        super(x, y, s);
        loadAnimationFromSheet("explosion.png", 6, 6, 0.02f, false);
    }

    public void act(float dt) {
        super.act(dt);

        if (isAnimationFinished())
            remove();
    }
}
