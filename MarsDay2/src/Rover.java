public class Rover {
    public Position p=null;
    public Rover(int x, int y, String dir)
    {
        p=new Position();
        p.pointer = p.directions.indexOf(dir);
        p.finalX=x;
        p.finalY=y;
    }

    public void goLeft()
    {
        if(p.pointer==0) p.pointer=3;
        else p.pointer=p.pointer-1;
    }

    public void goRight()
    {
        if(p.pointer==3) p.pointer=0;
        else p.pointer=p.pointer+1;
    }

    public void move(String dir)
    {
        switch (dir) {
            case "N":
                p.finalY++;
                break;
            case "S":
                p.finalY--;
                break;
            case "E":
                p.finalX++;
                break;
            case "W":
                p.finalX--;
                break;
        }
    }
}
