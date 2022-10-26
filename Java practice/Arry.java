
public class Arry{

public static void main(String args[]){





int arr[] ={1,2,3};

int copyarr[]=new int[arr.length];

for(int i=0;i<arr.length;i++)
copyarr[i]=arr[i];

System.out.println("The copy array is");
for(int i=0;i<copyarr.length;i++)
System.out.println(copyarr[i]+"");

}
}