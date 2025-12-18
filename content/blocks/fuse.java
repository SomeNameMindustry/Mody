block.fuse.ammoTypes: {
  //remove titanium ammo from the ammo map by using the special "-" value
  titanium: "-"
  //add surge alloy ammo that shoots a laser
  surge-alloy: {
    type: LaserBulletType
    //make it produce 1 shot per ammo item
    ammoMultiplier: 1
    //make it shoot half as fast
    reloadMultiplier: 0.5
    damage: 100
    //make it look awful!
    colors: ["000000", "ff0000", "ffffff"]
  }
}
