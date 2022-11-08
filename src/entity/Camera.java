package entity;

import org.lwjgl.glfw.GLFW;

import utilities.Vector3f;

public class Camera {

    private Vector3f pos;
    private float yaw, pitch, roll;

    private float speed = 0.5f;

    public Camera() {
        this.pos = new Vector3f(0,0,0);
        this.yaw = 0;
        this.pitch = 0;
        this.roll = 0;
    }

    public void update(long windowID) {
        //Update inputs
        boolean isForwardDown = GLFW.glfwGetKey(windowID, GLFW.GLFW_KEY_W) == GLFW.GLFW_PRESS;
        if(isForwardDown) {
            pos.z -= speed;
        }
        boolean isBackwardDown = GLFW.glfwGetKey(windowID, GLFW.GLFW_KEY_S) == GLFW.GLFW_PRESS;
        if(isBackwardDown) {
            pos.z += speed;
        }

        //Side to side
        boolean isLeftDown = GLFW.glfwGetKey(windowID, GLFW.GLFW_KEY_A) == GLFW.GLFW_PRESS;
        if(isLeftDown) {
            pos.x -= speed;
        }
        boolean isRightDown = GLFW.glfwGetKey(windowID, GLFW.GLFW_KEY_D) == GLFW.GLFW_PRESS;
        if(isRightDown) {
            pos.x += speed;
        }

        //Update up and down
        boolean isSpaceDown = GLFW.glfwGetKey(windowID, GLFW.GLFW_KEY_SPACE) == GLFW.GLFW_PRESS;
        if(isSpaceDown) {
            pos.y += speed;
        }
        boolean isLShiftDown = GLFW.glfwGetKey(windowID, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS;
        if(isLShiftDown) {
            pos.y -= speed;
        }
    }

    public Vector3f getPos() {
        return pos;
    }

    public void setPos(Vector3f position) {
        this.pos = position;
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