package bg.tu_varna.sit.f24621743.commitHandling;

public class CommitBuffer {
    private static CommitBuffer commitBuffer;

    StringBuilder buffer;
    String filePath;
    private CommitBuffer() {
        buffer = new StringBuilder();
    }
    public static CommitBuffer getInstance() {
        if (commitBuffer == null) {
            commitBuffer = new CommitBuffer();
        }
        return commitBuffer;
    }

    public StringBuilder getBuffer() {
        return buffer;
    }
    public void setBuffer(StringBuilder buffer) {
        this.buffer.replace(0, this.buffer.length(), buffer.toString());
    }
    public void appendBuffer(String commit) {
        buffer.append(commit).append(" ");
    }
    public void printBuffer() {
        System.out.println(buffer.toString());
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
