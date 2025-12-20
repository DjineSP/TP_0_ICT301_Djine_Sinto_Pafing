package LSP.avant_refactoring;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }

    @Override
    public void setHeight(int height) {
        super.height = height;
        super.width = height;
    }
    
}
