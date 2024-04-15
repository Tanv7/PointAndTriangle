public class Triangle {


    public static void main ( String[] args ) {

        Triangle t = new Triangle ( 1, 2, 5, 2, 5, 6 );
        System.out.println ( "Координаты первой вершины: x1 = " + t.k1.x + ", y1 = " + t.k1.y );
        System.out.println ( "Координаты второй вершины: x2 = " + t.k2.x + ", y2 = " + t.k2.y );
        System.out.println ( "Координаты третьей вершины: х3 = " + t.k3.x + ", y3 = " + t.k3.y );

        Triangle t2 = new Triangle ();
        t2.k1 = new Point ( 10, 20 );
        t2.k2 = new Point ( 10, 40 );
        t2.k3 = new Point ( 50, 60 );
        System.out.println ( "\nКоординаты первой вершины: x1 = " + t2.k1.x + ", y1 = " + t2.k1.y );
        System.out.println ( "Координаты второй вершины: x2 = " + t2.k2.x + ", y2 = " + t2.k2.y );
        System.out.println ( "Координаты третьей вершины: х3 = " + t2.k3.x + ", y3 = " + t2.k3.y );

    }
}

class Point {
    int x;
    int y;

    Point () {
    }

    Point ( int x, int y ) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {

    Point k1 = new Point ();
    Point k2 = new Point ();
    Point k3 = new Point ();

    Triangle ( int a, int b, int c, int d, int e, int f ) {
        k1.x = a;
        k1.y = b;
        k2.x = c;
        k2.y = d;
        k3.x = e;
        k3.y = f;
    }

    Triangle () {
    }
}
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, e, f; //стороны

    System.out.println("Первая длина");
            a = sc.nextInt();//Считываем первое число

            System.out.println("Вторая длина");
            b = sc.nextInt();//Считываем второе число

            .......

            System.out.println("Шестая длина");
            f = sc.nextInt();//Считываем шестое число

///ух.. стороны считали


