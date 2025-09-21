package dev.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.bold.AllIcons
import dev.chiksmedina.solar.bold.Arrows
import dev.chiksmedina.solar.bold.ArrowsAction
import dev.chiksmedina.solar.bold.Astronomy
import dev.chiksmedina.solar.bold.BuildingInfrastructure
import dev.chiksmedina.solar.bold.BusinessStatistic
import dev.chiksmedina.solar.bold.Call
import dev.chiksmedina.solar.bold.DesignTools
import dev.chiksmedina.solar.bold.ElectronicDevices
import dev.chiksmedina.solar.bold.EssentionalUi
import dev.chiksmedina.solar.bold.FacesEmotionsStickers
import dev.chiksmedina.solar.bold.Files
import dev.chiksmedina.solar.bold.Folders
import dev.chiksmedina.solar.bold.FoodKitchen
import dev.chiksmedina.solar.bold.Hands
import dev.chiksmedina.solar.bold.HomeFurniture
import dev.chiksmedina.solar.bold.Like
import dev.chiksmedina.solar.bold.List
import dev.chiksmedina.solar.bold.MapLocation
import dev.chiksmedina.solar.bold.Medicine
import dev.chiksmedina.solar.bold.MessagesConversation
import dev.chiksmedina.solar.bold.Money
import dev.chiksmedina.solar.bold.NatureTravel
import dev.chiksmedina.solar.bold.NetworkItProgramming
import dev.chiksmedina.solar.bold.Notes
import dev.chiksmedina.solar.bold.Notifications
import dev.chiksmedina.solar.bold.School
import dev.chiksmedina.solar.bold.Search
import dev.chiksmedina.solar.bold.Security
import dev.chiksmedina.solar.bold.SettingsFineTuning
import dev.chiksmedina.solar.bold.ShoppingEcommerce
import dev.chiksmedina.solar.bold.Sports
import dev.chiksmedina.solar.bold.TextFormatting
import dev.chiksmedina.solar.bold.Time
import dev.chiksmedina.solar.bold.TransportPartsService
import dev.chiksmedina.solar.bold.Users
import dev.chiksmedina.solar.bold.VideoAudioSound
import dev.chiksmedina.solar.bold.Weather
import kotlin.collections.List as KtList

object BoldSolar

val Solar.Bold: BoldSolar
    get() = BoldSolar

private var _AllIcons: KtList<ImageVector>? = null

val BoldSolar.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons =
            Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons + BuildingInfrastructure.AllIcons +
                    BusinessStatistic.AllIcons + Call.AllIcons + DesignTools.AllIcons +
                    ElectronicDevices.AllIcons + EssentionalUi.AllIcons + FacesEmotionsStickers.AllIcons +
                    Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons + Hands.AllIcons +
                    HomeFurniture.AllIcons + Like.AllIcons + List.AllIcons + MapLocation.AllIcons +
                    Medicine.AllIcons + MessagesConversation.AllIcons + Money.AllIcons + NatureTravel.AllIcons +
                    NetworkItProgramming.AllIcons + Notes.AllIcons + Notifications.AllIcons + School.AllIcons +
                    Search.AllIcons + Security.AllIcons + SettingsFineTuning.AllIcons +
                    ShoppingEcommerce.AllIcons + Sports.AllIcons + TextFormatting.AllIcons + Time.AllIcons +
                    TransportPartsService.AllIcons + Users.AllIcons + VideoAudioSound.AllIcons +
                    Weather.AllIcons + listOf()
        return _AllIcons!!
    }
