package com.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.Solar
import com.chiksmedina.solar.broken.AllIcons
import com.chiksmedina.solar.broken.Arrows
import com.chiksmedina.solar.broken.ArrowsAction
import com.chiksmedina.solar.broken.Astronomy
import com.chiksmedina.solar.broken.BusinessStatistic
import com.chiksmedina.solar.broken.Call
import com.chiksmedina.solar.broken.DesignTools
import com.chiksmedina.solar.broken.ElectronicDevices
import com.chiksmedina.solar.broken.EssentionalUi
import com.chiksmedina.solar.broken.FacesEmotionsStickers
import com.chiksmedina.solar.broken.Files
import com.chiksmedina.solar.broken.Folders
import com.chiksmedina.solar.broken.FoodKitchen
import com.chiksmedina.solar.broken.HomeFurniture
import com.chiksmedina.solar.broken.Like
import com.chiksmedina.solar.broken.List
import com.chiksmedina.solar.broken.MapLocation
import com.chiksmedina.solar.broken.Medicine
import com.chiksmedina.solar.broken.MessagesConversation
import com.chiksmedina.solar.broken.Money
import com.chiksmedina.solar.broken.NatureTravel
import com.chiksmedina.solar.broken.NetworkItProgramming
import com.chiksmedina.solar.broken.Notes
import com.chiksmedina.solar.broken.Notifications
import com.chiksmedina.solar.broken.School
import com.chiksmedina.solar.broken.Search
import com.chiksmedina.solar.broken.Security
import com.chiksmedina.solar.broken.SettingsFineTuning
import com.chiksmedina.solar.broken.ShoppingEcommerce
import com.chiksmedina.solar.broken.Sports
import com.chiksmedina.solar.broken.TextFormatting
import com.chiksmedina.solar.broken.Time
import com.chiksmedina.solar.broken.VideoAudioSound
import com.chiksmedina.solar.broken.Weather
import kotlin.collections.List as ____KtList

public object BrokenGroup

public val Solar.Broken: BrokenGroup
  get() = BrokenGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BrokenGroup.AllIcons: ____KtList<ImageVector>
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
        VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
    return __AllIcons!!
  }
