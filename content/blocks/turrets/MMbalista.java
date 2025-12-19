balista = new ItemTurret("balista") {{

	requirements = itemStack.with(Items.graphite, 50);

	size = 1;
	health = 150;
	armor = 1;
	range = 80f;
	category = turret;
	coolant = consumeCoolant(1f);
	recoil = 0f;
	reload = 120f;
	buildVisibility = shown;
	inacurracy = 1f;
	shoot = new shootPattern(){{

		shots = 2;
		shootDelay = 5;
	
	}};
	ammo(Items.graphite, new BulletType(){{
		
    frontColor = ffffff;
    backColor =ffffff;
    trailColo = ffffff;
		ammoMultiplier = 1;
		damage = 20;
		pierce = true;
		pierceCap = 2;
		knockback = 0.7;
		lifetime = 60;
		speed = 2;
		width = 7;
		height = 12;
		

    trailLength =  16;
    trailWidth = 3;

		
		
		hitColor = [ffffff]

		
	}})
