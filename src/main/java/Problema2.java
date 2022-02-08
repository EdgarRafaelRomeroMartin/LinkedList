class Almacen {
    int value;
    Almacen siguiente;

    Almacen(int val)
    {
        value = val;
        siguiente = null;
    }
}

public class Problema2 {
    public static void main(String[] args)
    {
        Problema2 list1 = new Problema2();
        list1.inicio = new Almacen(1);
        list1.inicio.siguiente = new Almacen(2);
        list1.inicio.siguiente.siguiente = new Almacen(3);
        list1.inicio.siguiente.siguiente.siguiente = new Almacen(4);
        list1.inicio.siguiente.siguiente.siguiente.siguiente = new Almacen(5);
        list1.inicio.siguiente.siguiente.siguiente.siguiente.siguiente = new Almacen(6);
        list1.inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente = new  Almacen(7);
        list1.inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente= new  Almacen(8);
        list1.inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente = new  Almacen(9);
        list1.inicio.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente= new  Almacen(10);
        System.out.println("Lista normal: ");
        list1.Listar();

        list1.Invertir();

        System.out.println("Lista invertida: ");
        list1.Listar();
    }


    Almacen inicio;


    private  Almacen fetchNode(int index)
    {
        Almacen temp = inicio;
        for (int i = 0; i < index; i++) {
            temp = temp.siguiente;
        }
        return temp;
    }

    int getSize( Almacen inicio)
    {
        Almacen temp =inicio;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.siguiente;
        }
        return size;
    }


    void Invertir()
    {
        int l = 0;
        int r = getSize(this.inicio) - 1;
        while (l < r) {
            Almacen a1 = fetchNode(l);
            Almacen a2 = fetchNode(r);

            int t = a1.value;
            a1.value = a2.value;
            a2.value = t;

            l++;
            r--;
        }
    }


    void Listar()
    {
        Almacen temp = this.inicio;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }


}