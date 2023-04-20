/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

import jdk.internal.dynalink.DefaultBootstrapper;

/**
 *
 * @author AMBER
 */
public class Ex0407student {
    private int 年 = 0;
    private int 月 = 0;
    private int 日 = 0;

    public void set年(int 年) {
        this.年 = 年;
    }

    public void set月(int 月) {
        if (月 < 1 || 月 > 12) {
            System.out.println("月份設定失敗" + 月);
            System.out.println("原因是月份設定錯誤，必須是1~12");
            return;
        } else {
            this.月 = 月;
        }
        System.out.println("月份設定成功" + 月);
    }

    public void set日(int 日) {
        if (日 < 1 || 日 > 30) {
            System.out.println("日期設定失敗" + 日);
            System.out.println("原因是日期設定錯誤，必須是1~30");
            return;
        } else {
            this.日 = 日;
        }
        System.out.println("日期設定成功" + 日);
    }

    public void 顯示資料() {
        if (this.年 == 0 || this.月 == 0 || this.日 == 0) {
            System.out.println("設定失敗，無法顯示" + 日);
        } else {
            System.out.println(this.年 + "/" + this.月 + "/" + this.日 + "/");
        }
    }
}
