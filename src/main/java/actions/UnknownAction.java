package actions;

import java.io.IOException;

import javax.servlet.ServletException;

import constants.ForwardConst;
//エラー発生時の処理を行う
public class UnknownAction extends ActionBase{
//お探しのページは見つかりませんでした表示
    @Override
    public void process() throws ServletException, IOException {
        // TODO 自動生成されたメソッド・スタブ
      //エラー画面を表示
        forward(ForwardConst.FW_ERR_UNKNOWN);
    }

}
