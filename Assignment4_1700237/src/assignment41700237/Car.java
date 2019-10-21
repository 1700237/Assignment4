package assignment41700237;

public class Car 
{
	private String licenseNo;
	private float horsePower;
    private String color;
    private String model;
	
     public Car() 
     {
	     super();
	     this.licenseNo = "";
	     this.horsePower = 0;
         this.color = "";
         this.model = "";
	 }



    public Car (String licenseNo, float horsePower, String color, String model)
      {
	    super();
	    this.licenseNo = licenseNo;
	    this.horsePower = horsePower;
        this.color = color;
        this.model = model;
      }


     public String getlicenseNo() 
       {
	      return licenseNo;
	   }


     public void setlicenseNo(String licenseNo) 
    {
	    this.licenseNo = licenseNo;
	}


     public float horsePower() 
        {
           return horsePower;
        }


     public void sethorsePower(float horsePower) 
    {
	    this.horsePower = horsePower;
	}

     public String getColor() 
    {
            return color;
	}


     public void setcolor(String color) 
    {
	    this.color = color;
	}

     public String model() 
        {
	       return model;
        }


     public void setModel(String model) 
    {
	    this.model = model;
	}



    public String toString() 
    {
	  return "Car [licenseNo=" + licenseNo +", horsePower=" + horsePower +", color=" + color +", model=" + model +"]";
	}
	public void display() 
        {
		   System.out.println(toString());
	    }
	
	

 }
