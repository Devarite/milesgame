package utilities;

import entity.Block;
import entity.Transform;
import entity.Object;

public class BlockToObject {
    public Object BlockToObject(Block block) {
        Transform transform = block.getTransform();
        String name = block.getName();
        int id = block.getId();
        int state = block.getState();

        Object object = new Object();
        object.setTransform(transform);
        object.setName(name);
        object.setId(id);
        object.setState(state);

        return object;
    }
}
