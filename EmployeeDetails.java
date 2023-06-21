public class PartTimeEmployees{

    private String name;
    private double salary;
    private String position;
    private String experience;
    private String educational_level;
    private String type;

    private double netSalary;

    //setters
    public void setPosition(String position){
        this.position=position;
    }
    public void setExperience(String experience){
        this.experience=experience;
    }
    public void seteducational_level(String educational_level){
        this.educational_level=educational_level;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setNetSalary(double netSalary){
        this.netSalary=netSalary;
    }
    public void setType(String type_full){
        this.type=type_full;
    }

    //getters
    public String getPosition(){
        return position;
    }
    public String getExperience(){
       return experience;
    }
    public String geteducational_level(){
       return educational_level;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getNetSalary(){
        return netSalary;
    }
    public String getType(){
        return type;
    }

    public double calculateNetSalary(double salary){
        if(educational_level=500){
 
         amount=(salary)+(salary* 5% * experience);
         netSalary=amount+500;
 
        }
        else if{
         if(educational_level=250){
 
             amount=(salary)+(salary* 5% * experience);
             netSalary=amount+250;
     
            }
            else{
             amount=(salary)+(salary* 5% * experience);
             netSalary=amount;
            }
            return netSalary;
        }
            public double calculateBounse_emp(double salary,String getType){
//calculate Bounse for Full Emp

            if(type=getType()){

                netSalary=salary*3%;
                netSalary=salary;
            }//calculate Bounse for Part Emp

            else{
                netSalary=salary*1.5%;
                netSalary=salary;
            }
        }
     }
return netSalary;
}
