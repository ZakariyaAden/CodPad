public class EncryptionKey {
    int hash;
    String msg;

    EncryptionKey(String msg, int hash){
        this.hash = hash;
        this.msg = msg;
    }
}
