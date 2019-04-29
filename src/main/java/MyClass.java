import java.math.BigInteger;

public class MyClass {
    public static void main(String args[]) {
        System.out.println("last ten digits of the series :" + lastTenDigits(5));
    }

    private static String lastTenDigits(int number){
        BigInteger series = BigInteger.ZERO;

        for (int i = 1; i <= number; i++) {
            series = series.add(BigInteger.valueOf(i).pow(i));
        }

        String lastTenDigits = series.toString();

        if(lastTenDigits.length() >= 10){
            return lastTenDigits.substring(lastTenDigits.length() - 10);
        }else{
            System.out.println("El número no tiene 10 dígitos");
            return lastTenDigits;
        }

    }
}