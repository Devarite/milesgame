package Renderer.shaders.uniforms;

import org.lwjgl.opengl.GL20;

public class UniformVec3 extends Uniform {
        public UniformVec3(String variable, int location) {
            super(variable, location);
        }

        public void loadVec3(float x, float y, float z) {
            GL20.glUniform3f(getShaderLocation(), x, y, z);
        }

}
