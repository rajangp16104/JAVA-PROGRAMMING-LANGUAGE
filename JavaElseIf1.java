public class JavaElseIf1{
    
    public static void main(String args[]){
        int age = 16;
        if(age>=18)
        {
            System.out.println("adult,drive,vote");

        }
        else if(age > 13 && age < 18)
        {
            System.out.println("teenager");

        }
        else 
        {
            System.out.println("not adult");
            
        }
        
    }

}