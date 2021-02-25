package MyDDA;

import java.util.List;

public class Profession {
    private String type;

    private String id;

    private String name;

    private String description;

    private int points;

    private List<String> CBMs;

    private List<Skills> skills;
    
    private Items items;

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setCBMs(List<String> CBMs) {
        this.CBMs = CBMs;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPoints() {
        return points;
    }

    public List<String> getCBMs() {
        return CBMs;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public Items getItems() {
        return items;
    }

    public static class Skills {

        private int level;

        private String name;

        public void setLevel(int level) {
            this.level = level;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + "\nlevel=" + level
                + ",\nname=" + name;
        }

    }

    public static class Items {

        private Both both;

        private List<String> male;

        private List<String> female;

        public void setBoth(Both both) {
            this.both = both;
        }

        public void setMale(List<String> male) {
            this.male = male;
        }

        public void setFemale(List<String> female) {
            this.female = female;
        }

        public Both getBoth() {
            return both;
        }

        public List<String> getMale() {
            return male;
        }

        public List<String> getFemale() {
            return female;
        }

        public static class Both {

            private List<String> items;

            private List<Entries> entries;

            public void setItems(List<String> items) {
                this.items = items;
            }

            public void setEntries(List<Entries> entries) {
                this.entries = entries;
            }

            public List<String> getItems() {
                return items;
            }

            public List<Entries> getEntries() {
                return entries;
            }

            public static class Entries {

                private String item;

                private String ammo_item;

                private int charges;

                public void setItem(String item) {
                    this.item = item;
                }

                public void setAmmo_item(String ammo_item) {
                    this.ammo_item = ammo_item;
                }

                public void setCharges(int charges) {
                    this.charges = charges;
                }

                public String getItem() {
                    return item;
                }

                public String getAmmo_item() {
                    return ammo_item;
                }

                public int getCharges() {
                    return charges;
                }

                @Override
                public String toString() {
                    return "[" + getClass().getCanonicalName() + "]"
                        + "\nitem=" + item
                        + ",\nammo_item=" + ammo_item
                        + ",\ncharges=" + charges;
                }

            }

            @Override
            public String toString() {
                return "[" + getClass().getCanonicalName() + "]"
                    + "\nitems=" + items
                    + ",\nentries=" + entries;
            }

        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + "\nboth=" + both
                + ",\nmale=" + male
                + ",\nfemale=" + female;
        }

    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\ntype=" + type
            + ",\nid=" + id
            + ",\nname=" + name
            + ",\ndescription=" + description
            + ",\npoints=" + points
            + ",\nCBMs=" + CBMs
            + ",\nskills=" + skills
            + ",\nitems=" + items;
    }
}
