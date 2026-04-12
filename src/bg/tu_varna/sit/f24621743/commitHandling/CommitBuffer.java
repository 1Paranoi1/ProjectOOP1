package bg.tu_varna.sit.f24621743.commitHandling;

import java.io.File;

public class CommitBuffer {

    private StringBuilder buffer;
    private File file;

    public CommitBuffer() {
        buffer = new StringBuilder();
    }

    public StringBuilder getBuffer() {
        return buffer;
    }

    public void setBuffer(StringBuilder buffer) {
        this.buffer.replace(0, this.buffer.length(), buffer.toString());
    }

    public void printBuffer() {
        System.out.println(buffer.toString());
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


}
