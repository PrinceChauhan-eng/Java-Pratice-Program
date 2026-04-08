package PracticeSet2;

public class EncryptGrade {
    public static void main(String[] args) {
        char grade = 'B';

        // Encrypt
        grade = (char)(grade + 8);
        System.out.println("Encrypted grade: " + grade);

        // Decrypt
        grade = (char)(grade - 8);
        System.out.println("Decrypted grade: " + grade);
    }
}