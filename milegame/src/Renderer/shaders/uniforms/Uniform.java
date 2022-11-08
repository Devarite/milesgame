package Renderer.shaders.uniforms;

import org.lwjgl.opengl.GL20;

public class Uniform {
    private String variable;
    private int location;

    public Uniform(String variable, int location) {
        this.variable = variable;
    }

    public void getUniformLocation(int programID) {
        location = GL20.glGetUniformLocation(programID, variable);
    }

    public int getShaderLocation() {
        return location;
    }

}
