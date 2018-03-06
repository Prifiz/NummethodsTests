package attribute;

import utils.MathUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public abstract class Vector {
    public int getSize() {
        return size;
    }

    protected int size;
    protected List<VectorComponent> components;

    public Vector(VectorComponent... components) {
        this.size = components.length;
        this.components = Arrays.asList(components);
    }

    public Vector(List<VectorComponent> components) {
        this.size = components.size();
        this.components = components;
    }

    public Vector(int size) {
        this.size = size;
        this.components = new ArrayList<>(size);
    }

    public VectorComponent getComponent(int componentNumber) /*throws IOException*/ {
//        if(componentNumber >= size) {
//            throw new IOException("No such component number!");
//        }
        return components.get(componentNumber);
    }

    public VectorComponent getComponentByName(String name) throws IOException {
        for(VectorComponent component : components) {
            if(name.equalsIgnoreCase(component.getName())) {
                return component;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(size);
        for(VectorComponent component : components) {
            stringBuilder.append(MathUtils.roundResult(component.getScalar().getValue(), 3) + "\n");
        }
        return stringBuilder.toString();
    }
}
