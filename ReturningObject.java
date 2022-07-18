class p {
    int x, y;
    p()
    {
        x = y = 0;
    }
    p(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
    p fun(p ob1)
    {
        this.x = ob1.x;
        this.y = ob1.y;
        System.out.println(x);
        System.out.println(y);
        return this;
    }
}

class ReturningObject {
    public static void main(String[] args) {
        p point1 = new p(5, 3);
        p point2;
        point2 = point1.fun(point1);
    }
}