package MyDDA;

import java.util.List;

public class Creature {
    private String id;

    private String type;

    private Name name;

    private String description;

    private String default_faction;

    private String bodytype;

    private List<String> categories;

    private List<String> species;

    private String volume;

    private String weight;

    private int hp;

    private int speed;

    private List<String> material;

    private String symbol;

    private String color;

    private int aggression;

    private int morale;

    private int melee_cut;

    private int dodge;

    private Reproduction reproduction;

    private String harvest;

    private List<String> fear_triggers;

    private List<String> death_function;

    private List<String> flags;

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDefault_faction(String default_faction) {
        this.default_faction = default_faction;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaterial(List<String> material) {
        this.material = material;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public void setMelee_cut(int melee_cut) {
        this.melee_cut = melee_cut;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public void setReproduction(Reproduction reproduction) {
        this.reproduction = reproduction;
    }

    public void setHarvest(String harvest) {
        this.harvest = harvest;
    }

    public void setFear_triggers(List<String> fear_triggers) {
        this.fear_triggers = fear_triggers;
    }

    public void setDeath_function(List<String> death_function) {
        this.death_function = death_function;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Name getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDefault_faction() {
        return default_faction;
    }

    public String getBodytype() {
        return bodytype;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getSpecies() {
        return species;
    }

    public String getVolume() {
        return volume;
    }

    public String getWeight() {
        return weight;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public List<String> getMaterial() {
        return material;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }

    public int getAggression() {
        return aggression;
    }

    public int getMorale() {
        return morale;
    }

    public int getMelee_cut() {
        return melee_cut;
    }

    public int getDodge() {
        return dodge;
    }

    public Reproduction getReproduction() {
        return reproduction;
    }

    public String getHarvest() {
        return harvest;
    }

    public List<String> getFear_triggers() {
        return fear_triggers;
    }

    public List<String> getDeath_function() {
        return death_function;
    }

    public List<String> getFlags() {
        return flags;
    }

    public static class Name {

        private String str;

        public void setStr(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + "\nstr=" + str;
        }

    }

    public static class Reproduction {

        private String baby_monster;

        private int baby_count;

        private int baby_timer;

        public void setBaby_monster(String baby_monster) {
            this.baby_monster = baby_monster;
        }

        public void setBaby_count(int baby_count) {
            this.baby_count = baby_count;
        }

        public void setBaby_timer(int baby_timer) {
            this.baby_timer = baby_timer;
        }

        public String getBaby_monster() {
            return baby_monster;
        }

        public int getBaby_count() {
            return baby_count;
        }

        public int getBaby_timer() {
            return baby_timer;
        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + "\nbaby_monster=" + baby_monster
                + ",\nbaby_count=" + baby_count
                + ",\nbaby_timer=" + baby_timer;
        }

    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\nid=" + id
            + ",\ntype=" + type
            + ",\nname=" + name
            + ",\ndescription=" + description
            + ",\ndefault_faction=" + default_faction
            + ",\nbodytype=" + bodytype
            + ",\ncategories=" + categories
            + ",\nspecies=" + species
            + ",\nvolume=" + volume
            + ",\nweight=" + weight
            + ",\nhp=" + hp
            + ",\nspeed=" + speed
            + ",\nmaterial=" + material
            + ",\nsymbol=" + symbol
            + ",\ncolor=" + color
            + ",\naggression=" + aggression
            + ",\nmorale=" + morale
            + ",\nmelee_cut=" + melee_cut
            + ",\ndodge=" + dodge
            + ",\nreproduction=" + reproduction
            + ",\nharvest=" + harvest
            + ",\nfear_triggers=" + fear_triggers
            + ",\ndeath_function=" + death_function
            + ",\nflags=" + flags;
    }
}
