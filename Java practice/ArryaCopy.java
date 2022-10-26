public class ArryaCopy{

public static void main(String args[]){


int arr[]={2,3,4,5,6,7};

int copyArr[]=new int[arr.length];


for(int i=0;i<arr.length;i++)
copyArr[i] = arr[i];

System.out.println("The copy array is ");

for(int i=0;i<copyArr.length;i++)
System.out.println(copyArr[i]+"");
}
}

