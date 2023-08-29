### Current state
Initial development. Not ready to be tested just yet.
### Open to contributions!
# About this & planned features
* A PaperMC server plugin focused on command handling
* Comparable to && in shell script (Linux shells, etc.)
* Sequential command execution.
## Example usage in-game
* ### With [LWCX commands](https://github.com/pop4959/LWCX/wiki/Commands):
* `/cpersist && /lock`
* `/cpersist && /cinfo`
* #### Please add your ideas of commands this would be helpful to use with in [Issues](https://github.com/nickstuaw/SafeBulkCommandExecution/issues).
# Downsides
* Commands which wait for the player cannot be used unless placed at the end.
  * This is an example of a command which won't work:
    * `/unlock && /lock`
    * `/lock && /cpersist && /lock`
  * What would work:
    * `/me hello I am here && /lock` 
# Config settings
* Maximum allowance of commands.
# Permissions
* `safebulkcommandexecution.commands.access`
Permissions can be used separately by administrators to control access per world if the host server uses Multiverse
using a permission manager (such as [LuckPerms](https://luckperms.net/)).

Special thanks to the [WinterCrest Survival](https://wintercrestmc.com/) Minecraft server for the sparks for this idea.