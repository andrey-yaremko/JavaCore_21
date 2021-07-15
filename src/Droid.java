public class Droid {
    @DroidInfo(value = "Droid - name anotation")
    private String name;
    @DroidInfo(value = "Droid - height anotation")
    private int height;
    @DroidInfo(value = "Droid - impactlevel anotation")
    private int impactlevel;



    public Droid(String name, int height, int impactlevel) {
        this.name = name;
        this.height = height;
        this.impactlevel = impactlevel;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getImpactlevel() {
        return impactlevel;
    }

    public void setImpactlevel(int impactlevel) {
        this.impactlevel = impactlevel;
    }



    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", impactlevel=" + impactlevel +

                '}';
    }
}
