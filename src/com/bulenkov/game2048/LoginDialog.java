package com.bulenkov.game2048;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linux_china
 */
public class LoginDialog extends DialogWrapper {

    private JPanel rootPanel;
    private JPasswordField myPassword;
    private JTextField myUserName;

    public LoginDialog(@Nullable Project project) {
        super(project);
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return rootPanel;
    }
}
