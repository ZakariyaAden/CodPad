public class EncryptionKey {
    int hash;
    String msg;

    EncryptionKey(int hash, String msg, char[] msgArr, int[] hashArr){
        this.hash = hash;
        this.msg = msg;
    }
}
