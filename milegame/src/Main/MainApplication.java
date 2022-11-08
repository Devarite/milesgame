package Main;

import Models.Vao;
import Renderer.SimpleRenderer;
import Renderer.Window;
import entity.Camera;
import entity.Transform;
import utilities.Vector3f;

public class MainApplication {

    public static void main(String[] args) {
        Window window = new Window();
        window.createWindow(1280, 720, "Milegame v0.1");

        float[] vertices = {
                0.0f, 0.0f, 0,
                1.0f, 1.0f, 0,
                0.0f, 1.0f, 0,

                0.0f, 0.0f, 0,
                1.0f, 1.0f, 0,
                0.0f, 1.0f, 0,
        };

        int[] indices = {
                0,1,2,
                0,1,0,
                2,0,1,
        };

        Vao vao = new Vao();
        vao.bind();
        vao.createFloatAttribute(0, vertices, 3);
        vao.createIndexBuffer(indices);
        vao.setIndexCount(indices.length);
        vao.unbind();

        Camera camera = new Camera();
        camera.setPos(new Vector3f(0.0f,0.0f,0.0f));

        Vector3f position = new Vector3f(0.0f, 0.0f, -2.0f);
        Transform transform = new Transform(
            position,
            new Vector3f(0.0f, 0.0f, 0.0f), // rot
            new Vector3f(1.0f, 1.0f, 1.0f) // scale
        );

        SimpleRenderer renderer = new SimpleRenderer();

        while (!window.shouldClose()) {
            transform.getRot().y += 0.5f;
            if (transform.getRot().y >= 360.0f) {
                transform.getRot().y = 0.0f;
            }

            renderer.render(vao, transform, camera);
            window.updateWindow();
        }

        window.closeWindow();
    }
}
