package dev.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.lineduotone.AllIcons
import dev.chiksmedina.solar.lineduotone.Arrows
import dev.chiksmedina.solar.lineduotone.ArrowsAction
import dev.chiksmedina.solar.lineduotone.Astronomy
import dev.chiksmedina.solar.lineduotone.BusinessStatistic
import dev.chiksmedina.solar.lineduotone.Call
import dev.chiksmedina.solar.lineduotone.DesignTools
import dev.chiksmedina.solar.lineduotone.ElectronicDevices
import dev.chiksmedina.solar.lineduotone.EssentionalUi
import dev.chiksmedina.solar.lineduotone.FacesEmotionsStickers
import dev.chiksmedina.solar.lineduotone.Files
import dev.chiksmedina.solar.lineduotone.Folders
import dev.chiksmedina.solar.lineduotone.FoodKitchen
import dev.chiksmedina.solar.lineduotone.HomeFurniture
import dev.chiksmedina.solar.lineduotone.Like
import dev.chiksmedina.solar.lineduotone.List
import dev.chiksmedina.solar.lineduotone.MapLocation
import dev.chiksmedina.solar.lineduotone.Medicine
import dev.chiksmedina.solar.lineduotone.MessagesConversation
import dev.chiksmedina.solar.lineduotone.Money
import dev.chiksmedina.solar.lineduotone.NatureTravel
import dev.chiksmedina.solar.lineduotone.NetworkItProgramming
import dev.chiksmedina.solar.lineduotone.Notes
import dev.chiksmedina.solar.lineduotone.Notifications
import dev.chiksmedina.solar.lineduotone.School
import dev.chiksmedina.solar.lineduotone.Search
import dev.chiksmedina.solar.lineduotone.Security
import dev.chiksmedina.solar.lineduotone.SettingsFineTuning
import dev.chiksmedina.solar.lineduotone.ShoppingEcommerce
import dev.chiksmedina.solar.lineduotone.Sports
import dev.chiksmedina.solar.lineduotone.TextFormatting
import dev.chiksmedina.solar.lineduotone.Time
import dev.chiksmedina.solar.lineduotone.Users
import dev.chiksmedina.solar.lineduotone.VideoAudioSound
import dev.chiksmedina.solar.lineduotone.Weather
import kotlin.collections.List as KtList

object LineDuotoneSolar

val Solar.LineDuotone: LineDuotoneSolar
    get() = LineDuotoneSolar

private var _AllIcons: KtList<ImageVector>? = null

val LineDuotoneSolar.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = Arrows.AllIcons + ArrowsAction.AllIcons + Astronomy.AllIcons +
                BusinessStatistic.AllIcons + Call.AllIcons + DesignTools.AllIcons +
                ElectronicDevices.AllIcons + EssentionalUi.AllIcons + FacesEmotionsStickers.AllIcons +
                Files.AllIcons + Folders.AllIcons + FoodKitchen.AllIcons + HomeFurniture.AllIcons +
                Like.AllIcons + List.AllIcons + MapLocation.AllIcons + Medicine.AllIcons +
                MessagesConversation.AllIcons + Money.AllIcons + NatureTravel.AllIcons +
                NetworkItProgramming.AllIcons + Notes.AllIcons + Notifications.AllIcons + School.AllIcons +
                Search.AllIcons + Security.AllIcons + SettingsFineTuning.AllIcons +
                ShoppingEcommerce.AllIcons + Sports.AllIcons + TextFormatting.AllIcons + Time.AllIcons +
                Users.AllIcons + VideoAudioSound.AllIcons + Weather.AllIcons + listOf()
        return _AllIcons!!
    }
