package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.networkitprogramming.Bug
import com.chiksmedina.solar.bold.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.Code
import com.chiksmedina.solar.bold.networkitprogramming.Code2
import com.chiksmedina.solar.bold.networkitprogramming.CodeCircle
import com.chiksmedina.solar.bold.networkitprogramming.CodeSquare
import com.chiksmedina.solar.bold.networkitprogramming.Command
import com.chiksmedina.solar.bold.networkitprogramming.Hashtag
import com.chiksmedina.solar.bold.networkitprogramming.HashtagChat
import com.chiksmedina.solar.bold.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.bold.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.bold.networkitprogramming.Programming
import com.chiksmedina.solar.bold.networkitprogramming.Screencast
import com.chiksmedina.solar.bold.networkitprogramming.Screencast2
import com.chiksmedina.solar.bold.networkitprogramming.SidebarCode
import com.chiksmedina.solar.bold.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.Siderbar
import com.chiksmedina.solar.bold.networkitprogramming.SlashCircle
import com.chiksmedina.solar.bold.networkitprogramming.SlashSquare
import com.chiksmedina.solar.bold.networkitprogramming.Station
import com.chiksmedina.solar.bold.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.bold.networkitprogramming.Structure
import com.chiksmedina.solar.bold.networkitprogramming.Translation
import com.chiksmedina.solar.bold.networkitprogramming.Translation2
import com.chiksmedina.solar.bold.networkitprogramming.Usb
import com.chiksmedina.solar.bold.networkitprogramming.UsbCircle
import com.chiksmedina.solar.bold.networkitprogramming.UsbSquare
import com.chiksmedina.solar.bold.networkitprogramming.WindowFrame
import com.chiksmedina.solar.bold.networkitprogramming.`Wi-fiRouterMinimalistic`
import com.chiksmedina.solar.bold.networkitprogramming.`Wi-fiRouterRound`
import com.chiksmedina.solar.bold.networkitprogramming.`Wi-fiRouter`
import kotlin.collections.List as ____KtList

public object NetworkItProgrammingGroup

public val BoldGroup.NetworkItProgramming: NetworkItProgrammingGroup
  get() = NetworkItProgrammingGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NetworkItProgrammingGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bug, BugMinimalistic, Code, Code2, CodeCircle, CodeSquare, Command, Hashtag,
        HashtagChat, HashtagCircle, HashtagSquare, Programming, Screencast, Screencast2,
        SidebarCode, SidebarMinimalistic, Siderbar, SlashCircle, SlashSquare, Station,
        StationMinimalistic, Structure, Translation, Translation2, Usb, UsbCircle, UsbSquare,
        `Wi-fiRouter`, `Wi-fiRouterMinimalistic`, `Wi-fiRouterRound`, WindowFrame)
    return __AllIcons!!
  }
