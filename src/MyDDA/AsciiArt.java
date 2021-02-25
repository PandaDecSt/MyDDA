package MyDDA;

import java.util.List;

public class AsciiArt {
    private String type;

    private String id;

    private List<String> picture;

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPicture(List<String> picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public List<String> getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\ntype=" + type
            + ",\nid=" + id
            + ",\npicture=" + picture;
    }
}
