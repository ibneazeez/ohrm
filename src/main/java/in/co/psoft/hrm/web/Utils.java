package in.co.psoft.hrm.web;

import javax.servlet.http.Part;
public class Utils {
    public static String getFileNameFromPart(Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : partHeader.split(";")) {
            if (content.trim().startsWith("filename")) {
                String fileName = content.substring(content.indexOf('=') + 1)
                        .trim().replace("\"", "");
             System.out.println(fileName);
                return fileName;
            }
        }
        return null;
    }
}