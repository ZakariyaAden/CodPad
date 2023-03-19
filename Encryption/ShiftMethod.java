public static String encrypt(String plainText, int shift) {
    StringBuilder encryptedText = new StringBuilder();
    int length = plainText.length();
    for (int i = 0; i < length; i++) {
        char c = plainText.charAt(i);
        if (Character.isUpperCase(c)) {
            encryptedText.append((char) ((c + shift - 65) % 26 + 65));
        } else if (Character.isLowerCase(c)) {
            encryptedText.append((char) ((c + shift - 97) % 26 + 97));
        } else {
            encryptedText.append(c);
        }
    }
    return encryptedText.toString();
}
