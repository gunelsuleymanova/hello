import java.sql.*;
import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(); // Bütün kitablar bura yığılacaq
        Map<String, Book> bookMap = new HashMap<>(); // ISBN-ə görə sürətli tapmaq üçün

        String query = "SELECT * FROM books";

        try (Connection conn = DBConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // 1. Veritabanından datanı çəkib ArrayList-ə doldururuq
            while (rs.next()) {
                Book book = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("isbn")
                );
                bookList.add(book);
            }

            // 2. Iterator istifadə edərək siyahını ekrana çap edirik
            System.out.println("--- Kitabların Siyahısı (Iterator ilə) ---");
            Iterator<Book> iterator = bookList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // 3. ArrayList-i Map-ə çeviririk (ISBN-ə görə axtarış üçün)
            for (Book b : bookList) {
                bookMap.put(b.getIsbn(), b);
            }

            // 4. Map-in gücünü yoxlayaq (Axtarış)
            System.out.println("\n--- ISBN-ə görə axtarış (978000000007) ---");
            String searchIsbn = "978000000007";
            if (bookMap.containsKey(searchIsbn)) {
                System.out.println("Tapılan kitab: " + bookMap.get(searchIsbn).getTitle());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}