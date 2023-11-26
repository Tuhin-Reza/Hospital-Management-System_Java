public class Array
{
public static void main(String[] args)
{
int array[]=new int[3];
int array1[]=new int[0];
int array2[]=new int[2];
array[0]=3;
array[1]=2;
array[2]=1;
array1=array;
array2=array1;
System.out.println(array[2]+array1[1]+array2[0]);
}
}