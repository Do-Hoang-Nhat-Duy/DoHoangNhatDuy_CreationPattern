
package bt3.shape;

public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;
    
    int bienDem;

    public int getBienDem() {
        return bienDem;
    }

    public void setBienDem(int bienDem) {
        this.bienDem = bienDem;
    }
    
    public abstract String draw();
}
