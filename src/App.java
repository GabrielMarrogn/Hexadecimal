import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        StringBuilder numeros = new StringBuilder();
        StringBuilder hexadecimal = new StringBuilder();
        int resto =0;
        
        for(;;){
            resto = a%16;
            a = a/16;

            numeros.append(resto +" ");

            if(a == 0){
                break;
            }
        }

        String hexa = numeros.toString();
        String[] arr = hexa.split(" ");
        int[] num = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }

        for(int i = arr.length -1; i >=0; i--){
            if(num[i] < 10){
                hexadecimal.append(num[i]);
            }else if(num[i] == 10){
                hexadecimal.append("A");
            }else if(num[i] == 11){
                hexadecimal.append("B");
            }else if(num[i] == 12){
                hexadecimal.append("C");
            }else if(num[i] == 13){
                hexadecimal.append("D");
            }else if(num[i] == 14){
                hexadecimal.append("E");
            }else if(num[i] == 15){
                hexadecimal.append("F");
            }
        }
        
        
        System.out.println(hexadecimal.toString());
    }
}
