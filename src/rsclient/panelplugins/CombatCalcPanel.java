/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsclient.panelplugins;

import java.awt.Color;
import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.text.NumberFormatter;
import net.miginfocom.swing.MigLayout;
import rsclient.coregui.LengthRestrictedDocument;

/**
 *
 * @author ben
 */
public class CombatCalcPanel extends JPanel {

	JTextField attackLevelField, strengthLevelField, defenseLevelField,
		rangedLevelField, magicLevelField, prayerLevelField, hitpointsLevelField;
	JButton calcButton;
	JLabel attackLabel, strengthLabel, defenseLabel, rangedLabel,
		magicLabel, prayerLabel, hitpointsLabel, combatLabel,
		combatLevelLabel;

	//Used to load a combat calculator into any extendable panel
	//This calculator should remain fairly resistant to panel size variations. 
	public CombatCalcPanel() {
		setup();
	}

	public void setup() {
		setLayout(new MigLayout("ins 5, left "));
		this.setBackground(new Color(52, 52, 52));
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

		attackLevelField = new JTextField();
		strengthLevelField = new JTextField();
		defenseLevelField = new JTextField();
		rangedLevelField = new JTextField();
		magicLevelField = new JTextField();
		prayerLevelField = new JTextField();
		hitpointsLevelField = new JTextField();
		calcButton = new JButton("CALC");

		attackLevelField.setDocument(new LengthRestrictedDocument(2));
		strengthLevelField.setDocument(new LengthRestrictedDocument(2));
		defenseLevelField.setDocument(new LengthRestrictedDocument(2));
		rangedLevelField.setDocument(new LengthRestrictedDocument(2));
		magicLevelField.setDocument(new LengthRestrictedDocument(2));
		prayerLevelField.setDocument(new LengthRestrictedDocument(2));
		hitpointsLevelField.setDocument(new LengthRestrictedDocument(2));

		combatLevelLabel = new JLabel();
		attackLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_attack.gif")));
		strengthLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_strength.gif")));
		defenseLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_defense.gif")));
		rangedLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_ranged.gif")));
		magicLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_magic.gif")));
		prayerLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_prayer.gif")));
		hitpointsLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_hitpoints.gif")));
		combatLabel = new JLabel(
			new ImageIcon(getClass().getClassLoader().getResource("resources/logo_combat.gif")));

		this.add(attackLabel, "cell 0 0");
		this.add(attackLevelField, "width 10%, height 15%, cell 1 0");

		this.add(strengthLabel, "cell 2 0, gapx 10");
		this.add(strengthLevelField, "width 10%, height 15%, cell 3 0");

		this.add(rangedLabel, "cell 4 0, gapx 10");
		this.add(rangedLevelField, "width 10%, height 15%, cell 5 0");

		this.add(defenseLabel, "cell 0 1");
		this.add(defenseLevelField, "width 10%, height 15%, cell 1 1");

		this.add(magicLabel, "cell 2 1, gapx 10");
		this.add(magicLevelField, "width 10%, height 15%, cell 3 1");

		this.add(prayerLabel, "cell 4 1, gapx 10");
		this.add(prayerLevelField, "width 10%, height 15%, cell 5 1");

		this.add(hitpointsLabel, "cell 0 2");
		this.add(hitpointsLevelField, "width 10%, height 15%, cell 1 2");
		this.add(calcButton, "left, cell 2 2, spanx, gapx 10");
		
		this.add(combatLabel, "cell 0 3");
		this.add(combatLevelLabel, "cell 1 3");
		
		combatLevelLabel.setForeground(Color.white);
		combatLevelLabel.setFont(new Font(combatLevelLabel.getFont().getName(), Font.BOLD, combatLevelLabel.getFont().getSize()));
		combatLevelLabel.setFont(new Font(combatLevelLabel.getFont().getName(), Font.PLAIN, 18));
		combatLevelLabel.setText("126");
		
	}
}
