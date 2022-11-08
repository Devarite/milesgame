package entity;

import utilities.Vector3f;
import entity.Transform;

// Used for blocks, and other items

public class Object {
    private Transform transform;
    private String name;
    private int id;
    private int state;

    public Object() {
        this.transform = new Transform(
                new Vector3f(0.0f, 0.0f, 0.0f), // Pos
                new Vector3f(0.0f, 0.0f, 0.0f), // Rot
                new Vector3f(1.0f, 1.0f, 1.0f) // Scale
        );
        this.name = "";
        this.id = 0;
        this.state = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Transform getTransform() {
        return transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }
}
