import java.util.Random;
public class exercicos {
    // Crie um programa que elabore um numero de telefone aleatorio "000-000-000"
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[3];
        nums[0] = random.nextInt(900) + 100;  
        nums[1] = random.nextInt(900)+ 100;  
        nums[2] = random.nextInt(9000) + 1000; 
        System.out.println(nums[0] + "-"+ nums[1] + "-" + nums[2] );
    }
}




