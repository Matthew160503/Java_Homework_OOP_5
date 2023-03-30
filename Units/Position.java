package Units;

public class Position {
    protected int x,y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Position opposit){
        if(opposit.y == y && opposit.x == x) return true;
        return false;
    }

    public float getDistance(BaseHero target){
        float dx = x- target.position.x;
        float dy = y - target.position.y;
        return (float)Math.sqrt(dx * dx + dy * dy);
    }
}
