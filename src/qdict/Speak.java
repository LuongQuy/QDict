/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qdict;
import java.io.*;
import com.sun.speech.freetts.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Quy
 */
abstract class Speak {
    private static final String VOICENAME = "kevin16";
    public static void voice(String txtVoice) {                                         
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
            voice.speak(txtVoice);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No Voice");
        }
    }
}
