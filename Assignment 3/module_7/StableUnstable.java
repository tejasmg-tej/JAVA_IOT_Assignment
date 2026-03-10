package module_7;

class StableUnstable{
public static void main(String[] args){
int a[]={21,22,11,12};
int b[]={21,22,11,12};

// Stable sort example (Bubble Sort)
for(int i=0;i<a.length-1;i++){
for(int j=0;j<a.length-i-1;j++){
if(a[j]/10>a[j+1]/10){
int t=a[j];a[j]=a[j+1];a[j+1]=t;
}
}
}
System.out.print("Stable (Bubble): ");
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");

// Unstable sort example (Selection Sort)
for(int i=0;i<b.length-1;i++){
int min=i;
for(int j=i+1;j<b.length;j++)
if(b[j]/10<b[min]/10)min=j;
int t=b[i];b[i]=b[min];b[min]=t;
}
System.out.print("\nUnstable (Selection): ");
for(int i=0;i<b.length;i++)
System.out.print(b[i]+" ");
}
}
/*
 * 9. Stable vs Unstable Sorting

Stable → keeps same order of equal elements
Examples: Bubble, Insertion, Merge

Unstable → order may change
Examples: Selection, Quick

Example

Original
(2,A) (2,B)

Stable sort
(2,A) (2,B)

Unstable sort
(2,B) (2,A) 
 */