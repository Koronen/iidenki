package menu;
import kanjitester.KanjiTestControl;

public class KanjiTestItem extends SubMenuEntry{
	
	public KanjiTestItem(){
		super("Kanji test","kanji_test_menu.gif");
	}

	public void run(){
		KanjiTestControl.doTest();
	}
}
