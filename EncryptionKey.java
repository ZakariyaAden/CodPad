public class EncryptionKey {
    int hash;
    String msg;
    char[] msgArr;
    int[] hashArr;

    EncryptionKey(int hash, String msg, char[] msgArr, int[] hashArr){
        this.hash = hash;
        this.msg = msg;
        this.msgArr = msgArr;
        this.hashArr = hashArr;
    }
}
