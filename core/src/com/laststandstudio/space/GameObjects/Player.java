/******************************************************************************
 * Space Shooter Software License
 * Version 0.0.2-alpha
 *
 * Copyright (C) 2015 Last Stand Studio
 *
 *  SpaceShooter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  SpaceShooter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with SpaceShooter.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

package com.laststandstudio.space.GameObjects;

import com.badlogic.gdx.math.Vector2;
import com.laststandstudio.space.engine.GameObject;

public class Player extends GameObject {

    public enum PlayerState {
        PLAYING, PAUSED, SPECTATING
    }

    public Player() {
        super();
    }

    public Player(float x, float y, int length, int width, float velocity) {
        super(x, y, length, width, velocity);
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public Vector2 getPosition() {
        return super.getPosition();
    }

    @Override
    public float getVelocity() {
        return super.getVelocity();
    }
}
