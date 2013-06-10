
package com.uwetrottmann.shopr.algorithm.model;

/**
 * Holds a list of possible attributes of an item.
 */
public class Attributes {

    public interface Attribute {
        public double[] getValueWeights();
    }

    private ClothingType type;

    private Color color;

    private Label label;

    public Attribute[] getAllAttributes() {
        Attribute[] attrs = new Attribute[3];

        attrs[0] = type();
        attrs[1] = color();
        attrs[2] = label();

        return attrs;
    }

    public Color color() {
        return color;
    }

    public Attributes color(Color color) {
        this.color = color;
        return this;
    }

    public ClothingType type() {
        return type;
    }

    public Attributes type(ClothingType type) {
        this.type = type;
        return this;
    }

    public Label label() {
        return label;
    }

    public Attributes label(Label label) {
        this.label = label;
        return this;
    }

}
