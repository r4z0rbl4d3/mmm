public class Vector {

	    private double x;
	    private double y;

	    public Vector(double valueX, double valueY){
	        x = valueX;
	        y = valueY;
	    }

	    public void add(Vector v){
	        x += v.x;
	        y += v.y;
	    }

	    public void sub(Vector v){
	        x -= v.x;
	        y -= v.y;
	    }

	    public void mul(Vector v){
	        x *= v.x;
	        y *= v.y;
	    }

	    public boolean equal(Vector v){
	        return (x == v.x && y == v.y);
	    }

	    public String toString(){
	        return x+","+y;
	    }

	    public double distanceTo(Vector v){
	        return Math.sqrt(Math.pow(x-v.x,2)+Math.pow(y-v.y,2));
	    };

	    public double absolute(){
	        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	    };

	    public Vector normalize(){
	        double abs = this.absolute();
	        return new Vector(x/abs, y/abs);
	    }

	    //TODO polymorphy check

	} 