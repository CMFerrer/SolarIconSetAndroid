package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.networkitprogramming.Bug
import com.chiksmedina.solar.outline.networkitprogramming.BugMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.Code
import com.chiksmedina.solar.outline.networkitprogramming.Code2
import com.chiksmedina.solar.outline.networkitprogramming.CodeCircle
import com.chiksmedina.solar.outline.networkitprogramming.CodeSquare
import com.chiksmedina.solar.outline.networkitprogramming.Command
import com.chiksmedina.solar.outline.networkitprogramming.Hashtag
import com.chiksmedina.solar.outline.networkitprogramming.HashtagChat
import com.chiksmedina.solar.outline.networkitprogramming.HashtagCircle
import com.chiksmedina.solar.outline.networkitprogramming.HashtagSquare
import com.chiksmedina.solar.outline.networkitprogramming.Programming
import com.chiksmedina.solar.outline.networkitprogramming.Screencast
import com.chiksmedina.solar.outline.networkitprogramming.Screencast2
import com.chiksmedina.solar.outline.networkitprogramming.SidebarCode
import com.chiksmedina.solar.outline.networkitprogramming.SidebarMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.Siderbar
import com.chiksmedina.solar.outline.networkitprogramming.SlashCircle
import com.chiksmedina.solar.outline.networkitprogramming.SlashSquare
import com.chiksmedina.solar.outline.networkitprogramming.Station
import com.chiksmedina.solar.outline.networkitprogramming.StationMinimalistic
import com.chiksmedina.solar.outline.networkitprogramming.Structure
import com.chiksmedina.solar.outline.networkitprogramming.Translation
import com.chiksmedina.solar.outline.networkitprogramming.Translation2
import com.chiksmedina.solar.outline.networkitprogramming.Usb
import com.chiksmedina.solar.outline.networkitprogramming.UsbCircle
import com.chiksmedina.solar.outline.networkitprogramming.UsbSquare
import com.chiksmedina.solar.outline.networkitprogramming.WindowFrame
import com.chiksmedina.solar.outline.networkitprogramming.`Wi-fiRouterMinimalistic`
import com.chiksmedina.solar.outline.networkitprogramming.`Wi-fiRouterRound`
import com.chiksmedina.solar.outline.networkitprogramming.`Wi-fiRouter`
import kotlin.collections.List as ____KtList

public object NetworkItProgrammingGroup

public val OutlineGroup.NetworkItProgramming: NetworkItProgrammingGroup
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
