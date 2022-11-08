package entity;

import utilities.Vector3f;

public class Transform {
    private Vector3f pos, rot, scale;

    public Transform(Vector3f pos, Vector3f rot, Vector3f scale) {
        this.pos = pos;
        this.rot = rot;
        this.scale = scale;
    }

    public Vector3f getPos() {
        return pos;
    }

    public Vector3f getRot() {
        return rot;
    }

    public Vector3f getScale() {
        return scale;
    }

    public void setPos(Vector3f pos) {
        this.pos = pos;
    }

    public void setRot(Vector3f rot) {
        this.rot = rot;
    }

    public void setScale(Vector3f scale) {
        this.scale = scale;
    }


}
