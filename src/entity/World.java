package entity;

// The world scene

public class World {
    private String name;
    private int id;
    private Object[] objects; // Objects in the world, Terrain, and Player.

    // unused world gen stuff
    private int seed;
    private int terrainType;
    private int noise;

    public World () {
        this.name = "world";
        this.id = 0;
        this.seed = 0;
        this.terrainType = 0;
        this.noise = 0;
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

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public int getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(int terrainType) {
        this.terrainType = terrainType;
    }

    public int getNoise() {
        return noise;
    }

    public void setNoise(int noise) {
        this.noise = noise;
    }
}
