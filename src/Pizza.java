public abstract class Pizza {
    private String type;

    public void setType(String newType){
        this.type = newType;

    }

    public String getType(){
        return this.type;

    }
    void prepare() {
        System.out.println(getType() + " is preparing");
    }

    void bake() {
        System.out.println(getType() + " is baking");
    }

    void cut() {
        System.out.println(getType() + " is cutting");
    }

    void box() {
        System.out.println(getType() + " is boxing");
    }
}
