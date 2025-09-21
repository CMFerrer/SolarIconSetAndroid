package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Bug
import dev.chiksmedina.solar.boldduotone.networkitprogramming.BugMinimalistic
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Code
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Code2
import dev.chiksmedina.solar.boldduotone.networkitprogramming.CodeCircle
import dev.chiksmedina.solar.boldduotone.networkitprogramming.CodeSquare
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Command
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Hashtag
import dev.chiksmedina.solar.boldduotone.networkitprogramming.HashtagChat
import dev.chiksmedina.solar.boldduotone.networkitprogramming.HashtagCircle
import dev.chiksmedina.solar.boldduotone.networkitprogramming.HashtagSquare
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Programming
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Screencast
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Screencast2
import dev.chiksmedina.solar.boldduotone.networkitprogramming.SidebarCode
import dev.chiksmedina.solar.boldduotone.networkitprogramming.SidebarMinimalistic
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Siderbar
import dev.chiksmedina.solar.boldduotone.networkitprogramming.SlashCircle
import dev.chiksmedina.solar.boldduotone.networkitprogramming.SlashSquare
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Station
import dev.chiksmedina.solar.boldduotone.networkitprogramming.StationMinimalistic
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Structure
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Translation
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Translation2
import dev.chiksmedina.solar.boldduotone.networkitprogramming.Usb
import dev.chiksmedina.solar.boldduotone.networkitprogramming.UsbCircle
import dev.chiksmedina.solar.boldduotone.networkitprogramming.UsbSquare
import dev.chiksmedina.solar.boldduotone.networkitprogramming.WifiRouter
import dev.chiksmedina.solar.boldduotone.networkitprogramming.WifiRouterMinimalistic
import dev.chiksmedina.solar.boldduotone.networkitprogramming.WifiRouterRound
import dev.chiksmedina.solar.boldduotone.networkitprogramming.WindowFrame
import kotlin.collections.List as KtList

object NetworkItProgrammingGroup

val BoldDuotoneSolar.NetworkItProgramming: NetworkItProgrammingGroup
    get() = NetworkItProgrammingGroup

private var _AllIcons: KtList<ImageVector>? = null

val NetworkItProgrammingGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bug, BugMinimalistic, Code, Code2, CodeCircle, CodeSquare, Command, Hashtag,
            HashtagChat, HashtagCircle, HashtagSquare, Programming, Screencast, Screencast2,
            SidebarCode, SidebarMinimalistic, Siderbar, SlashCircle, SlashSquare, Station,
            StationMinimalistic, Structure, Translation, Translation2, Usb, UsbCircle, UsbSquare,
            WifiRouter, WifiRouterMinimalistic, WifiRouterRound, WindowFrame
        )
        return _AllIcons!!
    }
