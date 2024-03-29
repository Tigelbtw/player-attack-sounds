package com.playerattacksounds;

import net.runelite.api.SoundEffectID;
import net.runelite.api.SoundEffectVolume;
import net.runelite.client.config.Range;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("AttackSound")
public interface PlayerAttackSoundsConfig extends Config
{
	@ConfigItem(
		keyName = "soundID",
		name = "Sound ID",
		description = "the ID of a sound you want to be played",
		position = 1
	)
	default int soundID()
	{
		return SoundEffectID.TOWN_CRIER_BELL_DING;
	}

	@Range(
			max = SoundEffectVolume.HIGH
	)
	@ConfigItem(
			keyName = "volume",
			name = "Volume",
			description = "The volume used for the sound played",
			position = 2
	)
	default int volume() {
		return SoundEffectVolume.MEDIUM_LOW;
	}

	@ConfigItem(
			keyName = "muteDuration",
			name = "Mute Duration (ms)",
			description = "The time that is waited until the sound can be played again",
			position = 3
	)
	default int muteDuration() {
		return 0;
	}

	@ConfigItem(
			keyName = "soundsOnDamageIntake",
			name = "Play sounds when taking damage",
			description = "If enabled, sounds will play when losing (or gaining) hp.",
			position = 4
	)
	default boolean soundsOnDamageIntake()	{ return false;	}

	@ConfigItem(
			keyName = "soundsOnlyWhileFocused",
			name = "Play sounds only when focused",
			description = "If enabled sounds will only play if you have the window in focus.",
			position = 5
	)
	default boolean soundsOnlyWhileFocused()	{ return false;	}

}
