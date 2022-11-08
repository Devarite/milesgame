package entity;

import utilities.Vector3f;
import entity.Transform;

public class Block {
    private Transform transform;
    private String name;
    private int id;
    private int state;
    private final float[] vertices;
    private final int[] indices;

    public Block() {
        this.transform = new Transform(
                new Vector3f(0.0f, 0.0f, 0.0f), // Pos
                new Vector3f(0.0f, 0.0f, 0.0f), // Rot
                new Vector3f(1.0f, 1.0f, 1.0f) // Scale
        );
        this.name = "";
        this.id = 0;
        this.state = 0;

        this.vertices = new float[]{
                // Face:  Index Value:

                0.0f, 0.0f, 0.0f, // 0 ---
                0.0f, 1.0f, 0.0f, // 1 -+-
                1.0f, 1.0f, 0.0f, // 2 ++-
                1.0f, 0.0f, 0.0f, // 3 +--
                0.0f, 0.0f, 1.0f, // 4 --+
                0.0f, 1.0f, 1.0f, // 5 -++
                1.0f, 1.0f, 1.0f, // 6 +++
                1.0f, 0.0f, 1.0f, // 7 +-+
        };

        this.indices = new int[]{

                0, 1, 2, 0, 2, 3,
                4, 6, 5, 4, 7, 6,
                4, 5, 1, 4, 1, 0,
                3, 2, 6, 3, 6, 7,
                1, 5, 6, 1, 6, 2,
                4, 0, 3, 4, 3, 7
        };
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

    public float[] getVertices() {
        return vertices;
    }

    public int[] getIndices() {
        return indices;
    }

    public Transform getTransform() {
        return transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }
}
