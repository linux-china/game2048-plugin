package com.bulenkov.game2048;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * game 2048 dialog
 *
 * @author linux_china
 */
public class Game2048Dialog extends DialogWrapper {
    Game2048 game2048 = new Game2048();

    public Game2048Dialog(@Nullable Project project) {
        super(project);
        setTitle("Game 2048");
        setResizable(false);
        init();
    }

    @Nullable
    protected JComponent createCenterPanel() {
        return game2048;
    }


    @Override
    protected JComponent createSouthPanel() {
        return null;
    }


    @Nullable
    @Override
    protected Border createContentPaneBorder() {
        return new EmptyBorder(0, 0, 0, 0);
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return game2048;
    }


    @Nullable
    @Override
    protected String getDimensionServiceKey() {
        return "game2048";
    }
}
