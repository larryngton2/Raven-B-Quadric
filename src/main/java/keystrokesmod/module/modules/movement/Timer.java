//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.8.9"!

package keystrokesmod.module.modules.movement;

import keystrokesmod.module.Module;
import keystrokesmod.module.ModuleSetting2;
import keystrokesmod.ay;
import keystrokesmod.module.ModuleSetting;
import keystrokesmod.module.modules.ClickGui;

public class Timer extends Module {
   public static ModuleSetting2 a;
   public static ModuleSetting b;

   public Timer() {
      super(new char[]{'T', 'i', 'm', 'e', 'r'}, Module.category.movement, 0);
      a = new ModuleSetting2(new char[]{'S', 'p', 'e', 'e', 'd'}, 1.0D, 0.5D, 2.5D, 0.01D);
      b = new ModuleSetting(new char[]{'S', 't', 'r', 'a', 'f', 'e', ' ', 'o', 'n', 'l', 'y'}, false);
      this.registerSetting(a);
      this.registerSetting(b);
   }

   public void update() {
      if (!(mc.currentScreen instanceof ClickGui)) {
         if (b.isToggled() && mc.thePlayer.moveStrafing == 0.0F) {
            ay.rt();
            return;
         }

         ay.gt().timerSpeed = (float)a.getInput();
      } else {
         ay.rt();
      }

   }

   public void onDisable() {
      ay.rt();
   }
}
