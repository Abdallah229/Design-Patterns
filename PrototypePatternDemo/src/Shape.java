public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public void setId(String newId) {
        id = newId;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}