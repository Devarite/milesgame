package Renderer;

import Renderer.shaders.shader;
import Renderer.shaders.uniforms.UniformMatrix4f;
import Renderer.shaders.uniforms.UniformVec3;

public class SimpleShader extends shader {
    protected UniformVec3 modelColor = new UniformVec3("modelColor", 0);
    protected UniformMatrix4f transformation = new UniformMatrix4f("transformation");
    protected UniformMatrix4f view = new UniformMatrix4f("view");
    protected UniformMatrix4f projection = new UniformMatrix4f("projection");

    public SimpleShader() {
        super("/resources/shaders/vert.glsl", "/resources/shaders/frag.glsl");
        super.locateUniform(modelColor);
        super.locateUniform(transformation);
        super.locateUniform(view);
        super.locateUniform(projection);
    }

    public UniformMatrix4f getTransformation() {
        return transformation;
    }

    public UniformMatrix4f getView() {
        return view;
    }

    public UniformMatrix4f getProjection() {
        return projection;
    }

    public UniformVec3 getModelColor() {
        return modelColor;
    }
}
