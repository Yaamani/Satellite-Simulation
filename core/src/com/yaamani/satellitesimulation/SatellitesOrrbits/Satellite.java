package com.yaamani.satellitesimulation.SatellitesOrrbits;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;
/**
 * Created by mahmo on 03/03/2018.
 */

public class Satellite {
    private Vector2 position = new Vector2();
    private float radius;
    private Color color;

    private Orbit currentOrbit;

    private boolean drawPath = false;

    public Satellite(float radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public void render(ShapeRenderer shapeRenderer) {
        update();

        shapeRenderer.set(ShapeRenderer.ShapeType.Line);

        if (currentOrbit != null & drawPath) currentOrbit.drawPath(shapeRenderer);

        shapeRenderer.set(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(color);
        shapeRenderer.circle(position.x, position.y, radius, 25);


    }

    private void update() {
        //if (currentOrbit != null) currentOrbit.updateSatellite(this, (TimeUtils.nanoTime()-currentOrbit.getStartTime())* MathUtils.nanoToSec);
    }

    public void setOrbit(Orbit orbit) {
        //orbit.setStartTime(TimeUtils.nanoTime());
        this.currentOrbit = orbit;
    }

    public Orbit getCurrentOrbit() {
        return currentOrbit;
    }

    public void setPosition(float x, float y) {
        this.position.set(x, y);
    }

    public void setDrawPath(boolean drawPath) {
        this.drawPath = drawPath;
    }
}









