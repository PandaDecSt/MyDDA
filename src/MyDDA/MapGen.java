package MyDDA;

import java.util.List;

public class MapGen {
    private String type;

    private Object object;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static class Object {

        private List<String> rows;

        private Terrain terrain;

        private Furniture furniture;

        public void setRows(List<String> rows) {
            this.rows = rows;
        }

        public List<String> getRows() {
            return rows;
        }

        public void setTerrain(Terrain terrain) {
            this.terrain = terrain;
        }

        public Terrain getTerrain() {
            return terrain;
        }

        public void setFurniture(Furniture furniture) {
            this.furniture = furniture;
        }

        public Furniture getFurniture() {
            return furniture;
        }

        public static class Terrain {



        }

        public static class Furniture {



        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + ",\nrows=" + rows
                + ",\nterrain=" + terrain
                + ",\nfurniture=" + furniture;
        }

    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\ntype=" + type
            + ",\nobject=" + object;
    }

}
