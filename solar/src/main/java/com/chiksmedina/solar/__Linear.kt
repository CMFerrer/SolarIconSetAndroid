package com.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.Solar
import com.chiksmedina.solar.linear.AllIcons
import com.chiksmedina.solar.linear.Arrows
import com.chiksmedina.solar.linear.ArrowsAction
import com.chiksmedina.solar.linear.Astronomy
import com.chiksmedina.solar.linear.BuildingInfrastructure
import com.chiksmedina.solar.linear.BusinessStatistic
import com.chiksmedina.solar.linear.Call
import com.chiksmedina.solar.linear.DesignTools
import com.chiksmedina.solar.linear.ElectronicDevices
import com.chiksmedina.solar.linear.EssentionalUi
import com.chiksmedina.solar.linear.FacesEmotionsStickers
import com.chiksmedina.solar.linear.Files
import com.chiksmedina.solar.linear.Folders
import com.chiksmedina.solar.linear.FoodKitchen
import com.chiksmedina.solar.linear.Hands
import com.chiksmedina.solar.linear.HomeFurniture
import com.chiksmedina.solar.linear.Like
import com.chiksmedina.solar.linear.List
import com.chiksmedina.solar.linear.MapLocation
import com.chiksmedina.solar.linear.Medicine
import com.chiksmedina.solar.linear.MessagesConversation
import com.chiksmedina.solar.linear.Money
import com.chiksmedina.solar.linear.NatureTravel
import com.chiksmedina.solar.linear.NetworkItProgramming
import com.chiksmedina.solar.linear.Notes
import com.chiksmedina.solar.linear.Notifications
import com.chiksmedina.solar.linear.School
import com.chiksmedina.solar.linear.Search
import com.chiksmedina.solar.linear.Security
import com.chiksmedina.solar.linear.SettingsFineTuning
import com.chiksmedina.solar.linear.ShoppingEcommerce
import com.chiksmedina.solar.linear.Sports
import com.chiksmedina.solar.linear.TextFormatting
import com.chiksmedina.solar.linear.Time
import com.chiksmedina.solar.linear.TransportPartsService
import com.chiksmedina.solar.linear.Users
import com.chiksmedina.solar.linear.VideoAudioSound
import com.chiksmedina.solar.linear.Weather
import kotlin.collections.List as ____KtList

public object LinearGroup

public val Solar.Linear: LinearGroup
  get() = LinearGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LinearGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons +
        BuildingInfrastructure.AllIcons + BusinessStatistic.AllIcons + Call.AllIcons +
        DesignTools.AllIcons + ElectronicDevices.AllIcons + EssentionalUi.AllIcons +
        FacesEmotionsStickers.AllIcons + Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons +
        Hands.AllIcons + HomeFurniture.AllIcons + Like.AllIcons + List.AllIcons +
        MapLocation.AllIcons + Medicine.AllIcons + MessagesConversation.AllIcons + Money.AllIcons +
        NatureTravel.AllIcons + NetworkItProgramming.AllIcons + Notes.AllIcons +
        Notifications.AllIcons + School.AllIcons + Search.AllIcons + Security.AllIcons +
        SettingsFineTuning.AllIcons + ShoppingEcommerce.AllIcons + Sports.AllIcons +
        TextFormatting.AllIcons + Time.AllIcons + TransportPartsService.AllIcons + Users.AllIcons +
        VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
    return __AllIcons!!
  }
