package entity;

import utilities.Vector3f;

public class Camera {
    private Vector3f pos;
    private float yaw, pitch, roll;

    public Camera() {
        this.pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.yaw = 0;
        this.pitch = 0;
        this.roll = 0;
    }

    public Vector3f getPos() {
        return pos;
    }

    public void setPos(Vector3f pos) {
        this.pos = pos;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public float getRoll() {
        return roll;
    }

    public void setRoll(float roll) {
        this.roll = roll;
    }


}
