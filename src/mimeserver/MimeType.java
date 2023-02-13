package mimeserver;

/**
 * public static final 생략
 */
public interface MimeType {
    String APPLICATION_JSON = "application/json"; // {"title":"제목", "content":"내용"}
    String TEXT_HTML = "text/html"; // <html>title : 제목 <br/> content : 내용</html>
    String FORM_URLENCODED = "application/x-www-form-urlencoded"; // title=제목&content=내용
}
