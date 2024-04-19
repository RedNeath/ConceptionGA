public class JsonSaveStrategy implements SaveStrategy {
    @Override
    public void save(MyFile content) {
        System.out.println("{content=\"" + content.getContent() + "\"}");
    }
}
