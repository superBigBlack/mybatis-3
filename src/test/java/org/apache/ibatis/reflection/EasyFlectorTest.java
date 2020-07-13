package org.apache.ibatis.reflection;

import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Description:
 * @author: guixiang
 * @Date: 2020-07-01
 */
public class EasyFlectorTest {

  @Test
  public void local(){
    String s = "啊啊啊AAAddd";
    System.out.println(s.toLowerCase(Locale.ENGLISH));

    Locale localeCN = Locale.SIMPLIFIED_CHINESE;

    Date date = new Date();
    System.out.println(DateFormat.getDateInstance( DateFormat.MEDIUM, localeCN).format(date));

  }


}
