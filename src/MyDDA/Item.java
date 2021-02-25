package MyDDA;

public class Item {

    public String type;

    public String id;

    public String category;

    public int price;

    public int price_postapoc;

    public Name name;

    public String symbol;

    public String color;

    public String description;

    public String[] flags;

    public String[] material;

    public String[] effects;

    public String volume;

    public int count;

    public Item setType(String type) {
        this.type = type;
        return this;
    }

    public Item setId(String id) {
        this.id = id;
        return this;
    }

    public Item setCategory(String category) {
        this.category = category;
        return this;
    }

    public Item setPrice(int price) {
        this.price = price;
        return this;
    }

    public Item setPrice_postapoc(int price_postapoc) {
        this.price_postapoc = price_postapoc;
        return this;
    }

    public Item setName(Name name) {
        this.name = name;
        return this;
    }

    public Item setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public Item setColor(String color) {
        this.color = color;
        return this;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public Item setFlags(String... flags) {
        this.flags = flags;
        return this;
    }

    public Item setMaterial(String... material) {
        this.material = material;
        return this;
    }

    public Item setEffects(String... effects) {
        this.effects = effects;
        return this;
    }

    public Item setVolume(String volume) {
        this.volume = volume;
        return this;
    }

    public Item setCount(int count) {
        this.count = count;
        return this;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getPrice_postapoc() {
        return price_postapoc;
    }

    public Name getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public String[] getFlags() {
        return flags;
    }

    public String[] getMaterial() {
        return material;
    }

    public String[] getEffects() {
        return effects;
    }

    public String getVolume() {
        return volume;
    }

    public int getCount() {
        return count;
    }

    public static class Name {

        public String str_sp;

        public void setStr_sp(String str_sp) {
            this.str_sp = str_sp;
        }

        public String getStr_sp() {
            return str_sp;
        }

        @Override
        public String toString() {
            return "[" + getClass().getCanonicalName() + "]"
                + "\nstr_sp=" + str_sp;
        }

    }

    @Override
    public String toString() {
        return "[" + getClass().getCanonicalName() + "]"
            + "\ntype=" + type
            + ",\nid=" + id
            + ",\ncategory=" + category
            + ",\nprice=" + price
            + ",\nprice_postapoc=" + price_postapoc
            + ",\nname=" + name
            + ",\nsymbol=" + symbol
            + ",\ncolor=" + color
            + ",\ndescription=" + description
            + ",\nflags=" + flags
            + ",\nmaterial=" + material
            + ",\neffects=" + effects
            + ",\nvolume=" + volume
            + ",\ncount=" + count;
    }

}
