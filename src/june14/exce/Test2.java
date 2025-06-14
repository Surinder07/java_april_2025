package june14.exce;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        try {
            System.out.println(arr[10]);
            System.out.println("hello");

            String s = "Pragra";
            s = null;

            System.out.println(s.toUpperCase());

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

            System.out.println("Always execute ");
        }


    }
}
