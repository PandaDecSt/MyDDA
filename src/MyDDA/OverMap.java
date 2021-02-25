package MyDDA;

import java.util.List;

public class OverMap {

    private String type;

    private String id;

    private String name;

    private String sym;

    private String color;

    private List<String> flags;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public String getSym() {
        return sym;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public List<String> getFlags() {
        return flags;
    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\ntype=" + type
            + ",\nid=" + id
            + ",\nname=" + name
            + ",\nsym=" + sym
            + ",\ncolor=" + color
            + ",\nflags=" + flags;
    }

}
