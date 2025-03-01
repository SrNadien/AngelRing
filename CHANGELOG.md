# Changelog - Angel Ring 2

## [3.0.0] - 2025-02-??

A brand new version of Angel Ring. This version is a complete rewrite of the mod, with a lot of new features and improvements. Requires Accessories instead of Curios API and support more modloaders: Fabric, Quilt and NeoForge. This version is not compatible with the previous versions of Angel Ring 2. Also note, if you previously used the any clone or fork of the mod, mod will try to override the ring with the new one to make sure that nothing was broken and you have seamless migration for 1.21+ versions. Modpack developers should provide a way to migrate the ring to the new version through the recipe changes, item replacement through CraftTweaker or KubeJS if any of the other forks or clones were used before.

NeoForge version requires NeoForge 21.0.42-beta or later, Accessories API 1.1.0-beta.16 or later, Curios Compat Layer for Accessories [???] or later.
Fabric version requires Fabric API 0.102.0 or later, Accessories API 1.1.0-beta.16 or later, Trinkets Compatibility Layer for Accessories [???] or later.

### Added
- Added support for Accessories API. Should work just fine also with just Curios or Trinkets API.
- Added support for Fabric and NeoForge modloaders. Forge is currently unsupported, however its support may come a bit later in 3.0.x builds.
- A brand new flight issues detection system provided by the Flight API. Now you will be notified about any issues with the flight and the mod will try to attempt to fix them. If this is not possible, then will notify you about the issue and problematic mod classes. You can report these issues to the mod authors.

### Changed
- Now the Angel Ring is in Classic Mode by default. Does not require anything. You can change the mode in the config file, so it will require energy (if Energy API is provided), XP to work if you changed this. Simple, yet powerful. If you want to use other way to power the ring, you can use the Angel Ring API to add your own way to power the ring.
- As of Angel Ring 3, there will be only two items. The Angel Ring and Diamond Ring. No more Energetic Angel Ring nor Thermal Angel Rings. The Angel Ring will have all the features of the previous versions such as ability to change the FE consumption and storage rates and so on.

### Fixed
- Fixed most of the flight issues with the Angel Ring. Now the flight should be more stable and reliable with most (if not every) mods.

### Removed
- Removed the Energetic Angel Ring and Thermal Foundation Angel Ring. Now there is only one Angel Ring item. However, they probably will come back as separate mod in the future with mod integrations.

## [2.3.1] - 2024-11-09

### Fixed
- Fixed an issue where the Angel Ring would not work properly due to a missing NBT check that was accidentally removed in the previous version when we started working on 3.0.0. Oops. Sorry about that.
- Fixed a tooltip being wrongly displayed when the Angel Ring was in Classic Mode.

## [2.3.0] - 2024-11-01

### Added
- Now Experience API supports Long values.
- Russian translation by TheAnaxMan.
- Turkish translation by RuyaSavascisi.

### Changed
- Changed the recipe for the Thermal Foundation's Angel Ring to use energetic one instead of the original one.

### Fixed
- Fixed an issue where the Angel Ring would not work properly when the player had more than ~15601 levels.
- Fixed an issue when the Angel Ring warned player about low energy, but the ring was in Classic Mode.

There may still be some incompatibilities with other mods, but we are working on it.