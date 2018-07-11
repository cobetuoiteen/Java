import java.util.Scanner;

class GetInput{
	public static void main(String[] thamso) {
		System.out.println("Byte input : ");
		Scanner myVar = new Scanner(System.in);
		System.out.println(myVar.nextByte());

                System.out.println("Short input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextShort());

                System.out.println("Int input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextInt());

                System.out.println("Long input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextLong());

                System.out.println("Float input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextFloat());

                System.out.println("Double input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextDouble());

                System.out.println("Boolean input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextBoolean());

                System.out.println("Line input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.nextLine());

                System.out.println("next input : ");
                myVar = new Scanner(System.in);
                System.out.println(myVar.next());
	}
}
