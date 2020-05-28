package chapter21;

import bean.Members;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter21/el"})
public class EL extends HttpServlet {

  public void doGet (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {

    // bean(membersオブジェクト)の生成
    Members m = new Members();

    m.setId(13);
    m.setName("YOUKO");
    m.setGender("F");

    // setAttributeメソッドでリクエスト属性にBeanを設定
    // membersという第一引数の属性に、第二引数のデータを設定する
    request.setAttribute("members", m);

    // JSPファイルにフォワード
    request.getRequestDispatcher("el.jsp")
    .forward(request, response);

  }
}
