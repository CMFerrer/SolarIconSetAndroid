package com.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.Solar
import com.chiksmedina.solar.outline.AllIcons
import com.chiksmedina.solar.outline.Arrows
import com.chiksmedina.solar.outline.ArrowsAction
import com.chiksmedina.solar.outline.Astronomy
import com.chiksmedina.solar.outline.BusinessStatistic
import com.chiksmedina.solar.outline.Call
import com.chiksmedina.solar.outline.DesignTools
import com.chiksmedina.solar.outline.ElectronicDevices
import com.chiksmedina.solar.outline.EssentionalUi
import com.chiksmedina.solar.outline.FacesEmotionsStickers
import com.chiksmedina.solar.outline.Files
import com.chiksmedina.solar.outline.Folders
import com.chiksmedina.solar.outline.FoodKitchen
import com.chiksmedina.solar.outline.HomeFurniture
import com.chiksmedina.solar.outline.Like
import com.chiksmedina.solar.outline.List
import com.chiksmedina.solar.outline.MapLocation
import com.chiksmedina.solar.outline.Medicine
import com.chiksmedina.solar.outline.MessagesConversation
import com.chiksmedina.solar.outline.Money
import com.chiksmedina.solar.outline.NatureTravel
import com.chiksmedina.solar.outline.NetworkItProgramming
import com.chiksmedina.solar.outline.Notes
import com.chiksmedina.solar.outline.Notifications
import com.chiksmedina.solar.outline.School
import com.chiksmedina.solar.outline.Search
import com.chiksmedina.solar.outline.Security
import com.chiksmedina.solar.outline.SettingsFineTuning
import com.chiksmedina.solar.outline.ShoppingEcommerce
import com.chiksmedina.solar.outline.Sports
import com.chiksmedina.solar.outline.TextFormatting
import com.chiksmedina.solar.outline.Time
import com.chiksmedina.solar.outline.Users
import com.chiksmedina.solar.outline.VideoAudioSound
import com.chiksmedina.solar.outline.Weather
import kotlin.collections.List as ____KtList

public object OutlineGroup

public val Solar.Outline: OutlineGroup
  get() = OutlineGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OutlineGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons +
        BusinessStatistic.AllIcons + Call.AllIcons + DesignTools.AllIcons +
        ElectronicDevices.AllIcons + EssentionalUi.AllIcons + FacesEmotionsStickers.AllIcons +
        Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons + HomeFurniture.AllIcons +
        Like.AllIcons + List.AllIcons + MapLocation.AllIcons + Medicine.AllIcons +
        MessagesConversation.AllIcons + Money.AllIcons + NatureTravel.AllIcons +
        NetworkItProgramming.AllIcons + Notes.AllIcons + Notifications.AllIcons + School.AllIcons +
        Search.AllIcons + Security.AllIcons + SettingsFineTuning.AllIcons +
        ShoppingEcommerce.AllIcons + Sports.AllIcons + TextFormatting.AllIcons + Time.AllIcons +
        Users.AllIcons + VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
    return __AllIcons!!
  }
