package org.seariver.screen;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import org.seariver.BaseActor;
import org.seariver.BaseGame;
import org.seariver.BaseScreen;
import org.seariver.actor.Ground;
import org.seariver.actor.Plane;
import org.seariver.actor.Sky;
import org.seariver.actor.Star;

public class LevelScreen extends BaseScreen {

    Plane plane;

    float starTimer;
    float starSpawnInterval;

    int score;
    Label scoreLabel;

    public void initialize() {

        new Sky(0, 0, mainStage);
        new Sky(800, 0, mainStage);
        new Ground(0, 0, mainStage);
        new Ground(800, 0, mainStage);

        plane = new Plane(100, 500, mainStage);
        BaseActor.setWorldBounds(800, 600);

        starTimer = 0;
        starSpawnInterval = 4;
        score = 0;

        scoreLabel = new Label(Integer.toString(score), BaseGame.labelStyle);
        uiTable.pad(10);
        uiTable.add(scoreLabel);
        uiTable.row();
        uiTable.add().expandY();
    }

    public void update(float deltaTime) {

        starTimer += deltaTime;

        if (starTimer > starSpawnInterval) {
            new Star(800, MathUtils.random(100, 500), mainStage);
            starTimer = 0;
        }

        for (BaseActor star : BaseActor.getList(mainStage, "org.seariver.actor.Star")) {
            if (plane.overlaps(star)) {
                star.remove();
                score++;
                scoreLabel.setText(Integer.toString(score));
            }
        }
    }

    public boolean keyDown(int keyCode) {

        if (keyCode == Keys.SPACE)
            plane.boost();

        return true;
    }
}
