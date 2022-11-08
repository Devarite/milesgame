package Main;

import Models.Vao;
import Renderer.Renderer;
import Renderer.Window;
import entity.*;
import org.lwjgl.glfw.GLFW;
import utilities.Vector3f;

public class MainApplication {

    public static void main(String[] args) {
        Window window = new Window();
        window.createWindow(1280, 720, "Milegame v0.1");

        Block block = new Block();

        Vao vao = new Vao();
        vao.bind();
        vao.createFloatAttribute(0, block.getVertices(), 3);
        vao.createIndexBuffer(block.getIndices());
        vao.setIndexCount(block.getIndices().length);
        vao.unbind();

        //Camera and rendering objects
        Camera camera = new Camera();
        camera.setPos(new Vector3f(0.0f,0.0f,0.0f));

        Renderer renderer = new Renderer();

        // Entities
        Transform transform = new Transform(new Vector3f(0.0f,0.0f,-2.0f), new Vector3f(0,0,0), new Vector3f(1.0f,1.0f,1.0f));
        Entity entity = new Entity();
        entity.setTransform(transform);
        entity.addComponent(new ModelComponent(vao));

        while (!window.shouldClose()) {
            block.getTransform().getRot().y += 0.5f;
            if (block.getTransform().getRot().y >= 360.0f) {
                block.getTransform().getRot().y = 0.0f;
            }
            block.getTransform().getRot().z += 0.5f;
            if (block.getTransform().getRot().z >= 360.0f) {
                block.getTransform().getRot().z = 0.0f;
            }

            //block.getTransform().getScale().setY((float) Math.sin(GLFW.glfwGetTime()) * 2);

            camera.update(window.windowID);
            renderer.render(entity, camera);
            window.updateWindow();
        }

        window.closeWindow();
    }
}
