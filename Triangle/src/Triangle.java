class Triangle
{
    private static int obj_count=0;
    double sideA, sideB, sideC;
    Triangle()
    {
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
        obj_count++;
    }
    Triangle(double x)
    {
        this.sideA= x;
        this.sideB= x;
        this.sideC= x;
        obj_count++;
    }
    Triangle(double x, double y)
    {
        this.sideA= x;
        this.sideB= x;
        this.sideC= y;
        obj_count++;
    }
    Triangle(double x, double y, double z)
    {
        this.sideA= x;
        this.sideB= y;
        this.sideC= z;
        obj_count++;
    }
    Triangle(Triangle other)
    {
        this.sideA= other.sideA;
        this.sideB= other.sideB;
        this.sideC= other.sideC;
        obj_count++;
    }


    public void set(int side_num, double given_side)
    {   
        if(side_num==1)
            this.sideA=given_side;

        else if(side_num==2)
            this.sideB=given_side;

        else
            this.sideC=given_side;
    }

    public double get(int side_num)
    {
        if(side_num==1)
            return this.sideA;
            
        else if(side_num==2)
            return this.sideB;

        return this.sideC;
    }

    public double paremeter()
    {
        return (this.sideA + this.sideB+ this.sideC);
    }
    public boolean isRightAngled()
    {
        double p,q,r;
        p=this.sideA*this.sideA;
        q=this.sideB*this.sideB;
        r=this.sideC*this.sideC;

        if (p==q+r || q==p+r || r==q+p)
            return true;

        return false;

    }
    public int object_counter()
    {
        return obj_count;
    }
    public String toString()
    {
        return " Side A= " + this.sideA + ",\t Side C= " + this.sideB + ",\t Side C= " + this.sideC;
    }
}