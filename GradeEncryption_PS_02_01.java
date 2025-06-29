// Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the corect grade.


public class GradeEncryption {
    public static void main(String[] args) {
        // Original grade
        char grade = 'B';

        // Encrypt the grade by adding 8
        char encryptedGrade = (char)(grade + 8);
        System.out.println("Encrypted Grade: " + encryptedGrade);

        // Decrypt the grade by subtracting 8
        char decryptedGrade = (char)(encryptedGrade - 8);
        System.out.println("Decrypted (Original) Grade: " + decryptedGrade);
    }
}


/*
Output 

Encrypted Grade: J
Decrypted (Original) Grade: B

*/
