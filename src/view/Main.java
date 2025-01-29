package view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setApproveButtonText("OK");
        FileNameExtensionFilter filter = new
                FileNameExtensionFilter("Imagens",
                "png", "bmp", "jpg", "jpeg", "gif");
        chooser.setFileFilter(filter);
        int retorno = chooser.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            System.out.println(chooser.getSelectedFile().length());
        }
    }
}