package dev.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.linear.AllIcons
import dev.chiksmedina.solar.linear.Arrows
import dev.chiksmedina.solar.linear.ArrowsAction
import dev.chiksmedina.solar.linear.Astronomy
import dev.chiksmedina.solar.linear.BuildingInfrastructure
import dev.chiksmedina.solar.linear.BusinessStatistic
import dev.chiksmedina.solar.linear.Call
import dev.chiksmedina.solar.linear.DesignTools
import dev.chiksmedina.solar.linear.ElectronicDevices
import dev.chiksmedina.solar.linear.EssentionalUi
import dev.chiksmedina.solar.linear.FacesEmotionsStickers
import dev.chiksmedina.solar.linear.Files
import dev.chiksmedina.solar.linear.Folders
import dev.chiksmedina.solar.linear.FoodKitchen
import dev.chiksmedina.solar.linear.Hands
import dev.chiksmedina.solar.linear.HomeFurniture
import dev.chiksmedina.solar.linear.Like
import dev.chiksmedina.solar.linear.List
import dev.chiksmedina.solar.linear.MapLocation
import dev.chiksmedina.solar.linear.Medicine
import dev.chiksmedina.solar.linear.MessagesConversation
import dev.chiksmedina.solar.linear.Money
import dev.chiksmedina.solar.linear.NatureTravel
import dev.chiksmedina.solar.linear.NetworkItProgramming
import dev.chiksmedina.solar.linear.Notes
import dev.chiksmedina.solar.linear.Notifications
import dev.chiksmedina.solar.linear.School
import dev.chiksmedina.solar.linear.Search
import dev.chiksmedina.solar.linear.Security
import dev.chiksmedina.solar.linear.SettingsFineTuning
import dev.chiksmedina.solar.linear.ShoppingEcommerce
import dev.chiksmedina.solar.linear.Sports
import dev.chiksmedina.solar.linear.TextFormatting
import dev.chiksmedina.solar.linear.Time
import dev.chiksmedina.solar.linear.TransportPartsService
import dev.chiksmedina.solar.linear.Users
import dev.chiksmedina.solar.linear.VideoAudioSound
import dev.chiksmedina.solar.linear.Weather
import kotlin.collections.List as KtList

object LinearSolar

val Solar.Linear: LinearSolar
    get() = LinearSolar

private var _AllIcons: KtList<ImageVector>? = null

val LinearSolar.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons +
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
        return _AllIcons!!
    }
