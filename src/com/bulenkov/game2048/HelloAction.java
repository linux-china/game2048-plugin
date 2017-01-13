package com.bulenkov.game2048;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.DialogWrapper;

/**
 * hello action
 *
 * @author linux_china
 */
public class HelloAction extends AnAction {
    public void actionPerformed(AnActionEvent anActionEvent) {
        //Messages.showInfoMessage("good", "welcome");
        DialogWrapper demoDialog = new Game2048Dialog(anActionEvent.getData(PlatformDataKeys.PROJECT_CONTEXT));
        demoDialog.show();
    }

    @Override
    public void update(AnActionEvent e) {
        super.update(e);
    }
}
