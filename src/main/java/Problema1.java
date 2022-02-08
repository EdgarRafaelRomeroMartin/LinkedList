
public class Problema1{
    public static void main(String[] args)
    {

        Problema1 Lista = new Problema1();
        float promedio;
        int suma;
        int n1 = (int)(Math.random()*100+1);
        int n2 = (int)(Math.random()*100+1);
        int n3 = (int)(Math.random()*100+1);
        int n4 = (int)(Math.random()*100+1);
        int n5 = (int)(Math.random()*100+1);
        int n6 = (int)(Math.random()*100+1);
        int n7 = (int)(Math.random()*100+1);
        int n8 = (int)(Math.random()*100+1);
        int n9 = (int)(Math.random()*100+1);
        int n10 = (int)(Math.random()*100+1);
        int n11 = (int)(Math.random()*100+1);
        int n12 = (int)(Math.random()*100+1);
        int n13 = (int)(Math.random()*100+1);
        int n14 = (int)(Math.random()*100+1);
        int n15 = (int)(Math.random()*100+1);
        int n16 = (int)(Math.random()*100+1);
        int n17 = (int)(Math.random()*100+1);
        int n18 = (int)(Math.random()*100+1);
        int n19 = (int)(Math.random()*100+1);
        int n20 = (int)(Math.random()*100+1);
        int n21 = (int)(Math.random()*100+1);
        int n22 = (int)(Math.random()*100+1);
        int n23 = (int)(Math.random()*100+1);
        int n24 = (int)(Math.random()*100+1);
        int n25 = (int)(Math.random()*100+1);
        Lista.addNode(n1);
        Lista.addNode(n2);
        Lista.addNode(n3);
        Lista.addNode(n4);
        Lista.addNode(n5);
        Lista.addNode(n6);
        Lista.addNode(n7);
        Lista.addNode(n8);
        Lista.addNode(n9);
        Lista.addNode(n10);
        Lista.addNode(n11);
        Lista.addNode(n12);
        Lista.addNode(n13);
        Lista.addNode(n14);
        Lista.addNode(n15);
        Lista.addNode(n16);
        Lista.addNode(n17);
        Lista.addNode(n18);
        Lista.addNode(n19);
        Lista.addNode(n20);
        Lista.addNode(n21);
        Lista.addNode(n22);
        Lista.addNode(n23);
        Lista.addNode(n24);
        Lista.addNode(n25);
        suma=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12+n13+n14+n15+n16+n17+n18+n19+n20+n21+n22+n23+n24+n25;
        promedio=suma/25;


        System.out.println("Lista normal: ");
        Lista.Listar();


        Lista.Ordenar();


        System.out.println("Lista areglada: ");
        Lista.Listar();

        System.out.println("La suma de los elementos es: "+suma);
        System.out.println("El promedio de el total de elementos es: "+ promedio);


    }

    class almacen {
        int datos;
        almacen siguiente;

        public almacen(int datos)
        {
            this.datos = datos;
            this.siguiente = null;
        }
    }


    public almacen Inicio = null;
    public almacen Final = null;


    public void addNode(int datos)
    {


        almacen NuevoAlmacaen = new almacen(datos);


        if (Inicio  == null) {


            Inicio  = NuevoAlmacaen;
            Final = NuevoAlmacaen;
        }
        else {


            Final.siguiente = NuevoAlmacaen;


            Final = NuevoAlmacaen;
        }
    }


    public void Ordenar()
    {


        almacen d1 = Inicio , d2 = null;

        int OwO;

        if (Inicio  == null) {
            return;
        }
        else {
            while (d1 != null) {

                d2 = d1.siguiente;

                while (d2 != null) {
                    if (d1.datos > d2.datos) {
                        OwO = d1.datos;
                        d1.datos = d2.datos;
                        d2.datos = OwO;
                    }

                    d2 = d2.siguiente;
                }
                d1 = d1.siguiente;
            }
        }
    }
    public void Listar()
    {
        almacen nuevo = Inicio ;

        if (Inicio  == null) {
            System.out.println("Lista esta basia");
            return;
        }
        while (nuevo != null) {

            System.out.print(nuevo.datos + " ");
            nuevo = nuevo.siguiente;
        }

        System.out.println();
    }}


