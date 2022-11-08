package Renderer;

import Models.Vao;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import entity.Camera;
import utilities.Matrix4f;
import utilities.MatrixUtils;
import entity.Transform;

public class SimpleRenderer {
    private SimpleShader shader;
    private MatrixUtils utils;

    public SimpleRenderer() {
        this.shader = new SimpleShader();
        this.utils = new MatrixUtils();
    }

    private void prepare() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        GL11.glClearColor(0.4f, 0.4f, 0.9f, 1f); // blueish sky colour
    }

    public void render(Vao vao, Transform transform, Camera camera) {
        prepare();
        shader.useProgram();
        // Shading
        float trY = transform.getRot().y / 360.0f;
       //System.out.println(trY);

        shader.getModelColor().loadVec3(0.0f, trY, 0.0f);

        Matrix4f transformation = utils.createTransformation(transform);
        shader.getTransformation().loadMatrix(transformation);
        Matrix4f view = utils.createCameraMatrix(camera);
        shader.getView().loadMatrix(view);
        Matrix4f projection = utils.createProjectionMatrix(90, 0.1f, 1500f);
        shader.getProjection().loadMatrix(projection);
        vao.render();
        shader.stopProgram();
    }
}
