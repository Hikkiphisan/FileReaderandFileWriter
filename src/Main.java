
import java.io.*;



public class Main {
    public static void main(String[] args) {
        String filePath = "src/input.txt";
         try (FileWriter writer = new FileWriter(filePath)) {
                  writer.write("Ngoại lệ được phát hiện (thrown) bởi JVM hoặc do chính chương trình tự ném ra.\n" +
                          "Hệ thống tìm kiếm bộ xử lý ngoại lệ tương ứng theo trình tự ngăn xếp lời gọi (call stack).\n" +
                          "Chương trình nhảy đến khối catch phù hợp hoặc kết thúc nếu không tìm thấy khối xử lý lỗi." );
         } catch (IOException e) {
             e.printStackTrace();
         }

        String filePath2 = "src/output.txt";
         try (FileReader reader = new FileReader(filePath2)) {
             int data;   //vi phuong thuc read() là kieu du lieu int
             while ((data = reader.read()) != -1) {
                 System.out.print((char) data);
             }
         } catch (IOException e) {
              e.printStackTrace();

             }
         }


    }
