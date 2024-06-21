package Second;

import java.io.File;

public class FileExistenceValidator implements Validator<String> {

    @Override
    public boolean validate(String path) {
        String filePath= path;
        File file = new File(path);
        if(file.exists()){
            return true;
        }
        return false;
    }
}
