# TEEST

Welcome to Teest, the Modern Remaster of that game you played on your dad's old calculator! <sub>~~and by "you," I mean "me" because I made it~~<sub>

## The Game

If you, the player, are not the Hero of this game, then let me introduce you. The Hero is quantumly-phrenologized being: 
-"_He_" could be a light-skinned human, a dark-skinned elf, or a blue-skinned lizard. 
-"_She_" could be wearing an old cloak, shiny plate mail, or a floofy ballgown. 
-"_They_" could be a pair of twins, or three goblins in a trenchcoat.

Even the Hero's past, personality, and procedures are better known by you than by me. All that the Hero needs to have are two working arms and the will to fight on. 

But like everything else, the Hero is defined just as much by actions as appearance. Some circumstance within the Hero's similarly nameless (and only slightly less featureless) fantasy realm will create a single-combat dual between the Hero and some foe or another. Each varies in fantasticality and familiarity, but all match or exceed the ferocity of their opponent. Initially, these enemies will be resisted by nothing sans a club. However, the Hero will gain access to new gear, martial manuevers, and magical spells (all ambiguous in their specific appearance and method of use) as enemies fall. And these boons will certainly be necessary to turn the tide, as successive foes grow stronger faster than the Hero does.


## How to Run

For best results, please set your console (or other output) to twelve lines. If you can't go that high, you'll have to scroll to find some of the text. Going higher won't cause any issues, but I did format the output with those twelve lines in mind. If you MUST go higher, consider setting the numbers of lines to a multiple of twelve.

Most Java compilers should be able to run Teest without any other assests, aside from the included files for object classes. If all necessary files are present, the game can also be run from the system command line once compiled there.

The gameplay isn't too obtuse, but as a summary: exchange attacks with the enemy at hand until either it or the Hero is defeated. If the Hero wins, one of three upgrades can be selected. Weapon upgrades unlock special attacks and increase the power of both these and basic attacks. Off-hand (shield) upgrades unlock some more defensive manuevers and increase the Hero's HP as well. Magic upgrades unlock new spells and increase their efficacy. An appendix of all learnable abilities is provided at the bottom. An enemy's name, attacks, and such are purely aesthetic (two enemies of the same level will be essentially identical), and they don't gain new abilities as they grow in power. However, the enemy's stats scale faster than the Hero's, and their initial %10 critical hit chance will rise by %2 each sucessive round. The Hero will run out of upgrades by level 17, but are free to continue fighting endlessly until some foe or another obtains victory.


## Contributors

While there is no one else who directly contributed to this project (as all original objects and methods are mine), it would have not been possible without the support and instruction of my instructors.


## Some Code I'm Proud Of

I managed to consolidate a lot of methods, but many of the Skills and Spells still required some extra stuff in the calling method. However, via the wonders of _methods-that-do-something-like-a-void-but-also-output-a-formattable-variable_, I managed to get everything necessary to perform a very circumstantial Action (_Ascended Mana Burst_, see below) into technically two lines:

```
} else if ((Action.getAction("Ascend")).isLearned()) {
				
	System.out.printf("You sacrifice %d health to abstract your %s,\n and strike for %d damage!\n",
		action.getUser().harm(Fighter.damage(heroLevel, statLevel)), action.getImplement(),
			target.harm(Fighter.damage(((int)(statLevel * 1.5)), statLevel)));
				
	((Skill)action).setCooldown();
			
} else {
```
<sub>(source comments excluded)</sub>
There's some prior variables set ("heroLevel" and "statLevel" are integers defined from the action earlier in the method, used for scaling), but those are just convenience variables that Actions already have internal methods to get.
Technically, the second line is useless as _Mana Burst_ has no cooldown (since it costs Mana, go figure), but I felt I should add it for future-proofing. Point is, it's arguably _one_ long line of code inside that if-else.


And while they aren't _exactly_ code, I think I wrote up some cool, creative, and funny enemy descriptions. Be sure to view them with "3" on the battle screen.



##Appendix: Skill and Spell effects

### Weapon level 2: ***Lunge***

Deals damage scaled from the _Weapon_ stat. Has a wider damage range than a normal attack. If it kills, the enemy will be denied any chance of a mutual-kill, making it useful when both parties are close to death.


### Weapon level 4: ***Mana Burst***

Sacrifices 50% of maximum Mana to deal a strong, _Weapon_-scaled attack. Cannot be used if Mana is below that threshold.

Special: ***Ascended Mana Burst***

If the Hero lacks the Mana necessary to perform a _Mana Burst_ but also knows the _Ascend_ Spell, health can be sacrificed to perform the Skill. No confirmation is asked before _Ascending_ a qualifying _Mana Burst_, so be careful if the Hero knows both and is low on Mana.


### Off-hand level 2: ***Counter***

Deals light damage scaling only from the Hero's level. Reduces incoming damage by the same amount, possibly stunning.


### Off-hand level 4: ***Shield Bash***

Deals damage scaling from the _Shield_ stat. Has a coin-flip chance to outright stun the target; if this succeeds, cooldown is increased by two.


### Magic level 1: ***Drain***

Restores a small amount of health to the user scaled from the _Magic_ stat. This amount is also reduced from the enemy's potential damage, possibly stunning them.


###Magic level 2: ***Bolt***

Deals damage scaling from the _Magic_ stat. Its cheap cost makes it a good spammable attack option if the Hero has a weaker weapon.


### Magic level 3: ***Ascend***

Sacrifices a portion of current Health* to restore 50% of maximum Mana. Has no Mana cost itself.
<sub>*it's actually a level-scaled attack against the Hero</sub>

### Magic level 4: ***Revert***

Restores a large amount of health to the user scaled from the _Magic_ stat. Expensive, but efficable.


### Magic level 5: ***Astra***

Summons a random number of "stars," up to the amount that the Hero has the Mana to cast. Each "star" does _Magic_-scaling damage and costs mana individually. 
