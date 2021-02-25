package MyDDA;

import java.util.List;

public class ItemGroup {

    private String type;

    private String id;

    private String subtype;

    private List<Entries> entries;

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setEntries(List<Entries> entries) {
        this.entries = entries;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getSubtype() {
        return subtype;
    }

    public List<Entries> getEntries() {
        return entries;
    }

    public static class Entries {

        private String item;

        private int prob;

        public void setItem(String item) {
            this.item = item;
        }

        public void setProb(int prob) {
            this.prob = prob;
        }

        public String getItem() {
            return item;
        }

        public int getProb() {
            return prob;
        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + "\nitem=" + item
                + ",\nprob=" + prob;
        }

    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\ntype=" + type
            + ",\nid=" + id
            + ",\nsubtype=" + subtype
            + ",\nentries=" + entries;
    }

}
