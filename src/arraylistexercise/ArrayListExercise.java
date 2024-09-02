
package arraylistexercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListExercise {

   public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong phan tu cua mang: ");
        int size = scanner.nextInt();
        for (int i = 0;i< size;i++){
            System.out.println("numbers["+i+"]=");
            int value = scanner.nextInt();
            numbers.add(value);
        }
        return numbers;
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("numbers[]="+Arrays.toString(numbers.toArray()));
    }
    public static float findMax2(float[] mang) {
        float max = Float.MIN_VALUE,max2 = Float.MIN_VALUE;
        for (float so : mang) {
            if (so > max) {
                max2 = max;
                max = so;
            } else if (so > max2 && so < max) {
                max2 = so;
            }
        }
        return max2;
    }
    public static float[] deleteOddNumber(float[] mang) {
        int demSoChan = 0;
        for (float so : mang){
            if (so % 2 == 0){
                demSoChan++;
            }
        }
        float[] mangSoChan = new float[demSoChan];
        int chiSo = 0;
        for (float so : mang){
            if (so % 2 ==0){
                mangSoChan[chiSo++] = so;
            }
        }
        return mangSoChan;
    }
     public static void printData(float[] mang) {
        System.out.println(Arrays.toString(mang));
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("Menu: Nhap data(phim 1), xuat data(phim 2)");
            int choosion = Integer.parseInt(scanner.nextLine());
            switch (choosion){
                case 1:
                    numbers = ArrayListExercise.EnterData(numbers);
                    break;
                case 2:
                    ArrayListExercise.DisplayData(numbers);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
            System.out.println("Nhap yes de tiep tuc chuong trinh");
            check = scanner.nextLine();
        }while (check.equals("yes"));
        float[] mang = new float[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            mang[i] = numbers.get(i);
        }

        float lonThuHai = findMax2(mang);
        System.out.println("Phan tu lon thu 2 trong mang: " + lonThuHai);
        float[] mangSoChan = deleteOddNumber(mang);
        System.out.print("Mang sau khi xoa cac so le: ");
        printData(mangSoChan);
    }
}
