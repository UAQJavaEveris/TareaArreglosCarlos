package mx.com.everis.taller.clases;

public class ClaseArreglosOperacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arreglo1={1,2,3,5,8,9};
		int []arreglo2={11,24,34,512,812,912	};
		System.out.println("La suma total del arreglo en forma ascendente: "+ClaseArreglosOperacion.sumaArregloAcendente(arreglo1));
		System.out.println("La suma total del arreglo en forma descendente "+ClaseArreglosOperacion.sumaArregloDescendente(arreglo2));
	}
	
	public static int sumaArregloAcendente(int ar[])
	{
		int sumaAss=0;
		for(int i=0;i<ar.length;i++)
		{
			sumaAss+=ar[i];
		}
		return sumaAss;
	}
	
	public static int sumaArregloDescendente(int arr2[])
	{
		int sumaDess=0;
		for(int i=arr2.length-1;i>=0;i--)
		{
			sumaDess+=arr2[i];
		}
		return sumaDess;
	}

}
