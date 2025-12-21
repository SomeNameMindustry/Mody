type: ItemTurret
targetGround: false
size: 1
range: 125
health: 1250
rotateSpeed: 4
recoil: 1
reload: 60
inaccuracy: 1
ammoPerShot: 2
ammoTypes: {
	graphite: {
    collidesGround: false
    damage: 50
    splashDamage: 5
    splashDamageRadius: 16
    ammoMultiplier: 1
    speed: 3
    lifetime: 45
    sprite: arrow
    width: 4
    height: 1
    frontColor: fffac6
    backColor: d8d97f
    trailColor: d8d97f
		}
}
consumes: {
  coolant: { 
    amount: 0.6
  }
}

coolantMultiplier: 1.2
category: turret
requirements: [
  copper/120
  lead/300
  silicon/50
]
