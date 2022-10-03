// tip: each public class is put in its own file
public class main
{static int[] arr() {
    int a[]=new int[5];
    int b = a.length;
    for(int i=0; i < b; i++)
    a[i]=i;
    return a;
}

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {int a[]=arr();
    for(int i=0; i< a.length; i++)
        System.out.print(a[i]+"");
    }
}
