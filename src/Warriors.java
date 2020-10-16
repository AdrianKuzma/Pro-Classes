public class Warriors {
    private String name;
    private int life;
    private int speed;
    private int muscle;

    public Items[] getItems() {
        return items;
    }

    private  Items[] items;

    public void setLife(int life) {
        this.life = life;
    }

    public Warriors (String name, int life, int speed, int muscle, Items[] items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }

    public int getLife() {
        return life;
    }

    public int getForce() {
        return life + speed + muscle;
    }
}
