// BirthdayCardFactory.java
// D. Singletary
// 7/2/23
// Birthday card factories

package edu.fscj.cop3330c.birthday;

import edu.fscj.cop3330c.image.ImageType;

public abstract class BirthdayCardFactory {
    public abstract BirthdayCard createCardChild(User u);
    // FIB 3 Add the remaining abstract methods for  
    // adolescents, adults, and seniors after this comment
    // (do not remove these comment lines)
}

class BirthdayCardFactoryText extends BirthdayCardFactory {
    public BirthdayCard createCardChild(User u) {
        return new BirthdayCard_ChildText(u);
    }
    // FIB 4 Add the remaining 3 method implementations for
    // adolescents, adults, and seniors after this comment
    // (do not remove these comment lines)

}

class BirthdayCardFactoryImage extends BirthdayCardFactory {

    public static String getImageFile(ImageType type,
                                      String ageStr) {
        String fileName = "";
        if (type != ImageType.NONE)
            fileName = "bdc-" + ageStr +
                       ImageType.getFileExtension(ImageType.JPG);
        else {
            System.err.println("error - invalid file spec");
        }
        return fileName;
    }

    public BirthdayCard createCardChild(User u) {
        return new BirthdayCard_ChildImage(u);
    }
    // FIB 5 Add the remaining 3 method implementations for
    // adolescents, adults, and seniors after this comment
    // (do not remove these comment lines)

}