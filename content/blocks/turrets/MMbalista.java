package mindustry.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class MMBlocks{
    public static Block
  
balista

  public static void load(){

balista = new MMItemTurret("balista"){{
  
      requirements(Category.turret, with(Items.graphite, 50));
 size = 1;
 scaledHealth = 200;
	reload = 120;
		recoil = 1f;
  recoilTime = 5f;
  maxAmmo = 2;
  range = 20;
  shootCone = 5f;
  inacurracy = 1f;
  rotateSpeed = 10f;
   coolant = consumeCoolant(1f);

  shoot = new ShootAlternate() {{
				barrels = 1;
				shots = 1;
				barrelOffset = 0;
				spread = 0f;
				velocityRnd = 1f;
			}};
  
     ammo(
            Items.graphite, new BasicBulletType(8f, 41){{
              Color front = Pal.bulletYellow, back = Pal.bulletYellowBack;
                knockback = 1f;
                width = 5f;
                hitSize = 6f;
                height = 40f;
                shootEffect = Fx.shootBigColor;
                smokeEffect = Fx.shootSmokeSquareSparse;
                ammoMultiplier = 2;
                hitColor = backColor = trailColor = Color.valueOf("ea8878");
                frontColor = Pal.redLight;
                trailWidth = 6f;
                trailLength = 3;
                hitEffect = despawnEffect = Fx.hitSquaresColor;
                buildingDamageMultiplier = 0.5f;
            }}
 }
}













