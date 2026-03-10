package module_7;

class CompareSort{
static void bubble(int a[]){
for(int i=0;i<a.length-1;i++)
for(int j=0;j<a.length-i-1;j++)
if(a[j]>a[j+1]){
int t=a[j];a[j]=a[j+1];a[j+1]=t;
}
}

static void insertion(int a[]){
for(int i=1;i<a.length;i++){
int key=a[i],j=i-1;
while(j>=0&&a[j]>key){
a[j+1]=a[j];
j--;
}
a[j+1]=key;
}
}

public static void main(String[] args){
int a[]={5,3,8,4,2};
int b[]=a.clone();

bubble(a);
insertion(b);

System.out.print("Bubble: ");
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");

System.out.print("\nInsertion: ");
for(int i=0;i<b.length;i++)
System.out.print(b[i]+" ");
}
}

/*
  Complexity Comparison

Algorithm	Best	Average	Worst	Space
Bubble	   O(n)	    O(n²)	O(n²)	O(1)
Selection	O(n²)	O(n²)	O(n²)	O(1)
Insertion	O(n)	O(n²)	O(n²)	O(1)
Merge	O(n log n)	O(n log n)	O(n log n)	O(n)
Quick	O(n log n)	O(n log n)	O(n²)	O(log n)
 */

