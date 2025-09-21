package dev.chiksmedina.solar

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.Solar
import dev.chiksmedina.solar.boldduotone.AllIcons
import dev.chiksmedina.solar.boldduotone.Arrows
import dev.chiksmedina.solar.boldduotone.ArrowsAction
import dev.chiksmedina.solar.boldduotone.Astronomy
import dev.chiksmedina.solar.boldduotone.BusinessStatistic
import dev.chiksmedina.solar.boldduotone.Call
import dev.chiksmedina.solar.boldduotone.DesignTools
import dev.chiksmedina.solar.boldduotone.ElectronicDevices
import dev.chiksmedina.solar.boldduotone.EssentionalUi
import dev.chiksmedina.solar.boldduotone.FacesEmotionsStickers
import dev.chiksmedina.solar.boldduotone.Files
import dev.chiksmedina.solar.boldduotone.Folders
import dev.chiksmedina.solar.boldduotone.FoodKitchen
import dev.chiksmedina.solar.boldduotone.HomeFurniture
import dev.chiksmedina.solar.boldduotone.Like
import dev.chiksmedina.solar.boldduotone.List
import dev.chiksmedina.solar.boldduotone.MapLocation
import dev.chiksmedina.solar.boldduotone.Medicine
import dev.chiksmedina.solar.boldduotone.MessagesConversation
import dev.chiksmedina.solar.boldduotone.Money
import dev.chiksmedina.solar.boldduotone.NatureTravel
import dev.chiksmedina.solar.boldduotone.NetworkItProgramming
import dev.chiksmedina.solar.boldduotone.Notes
import dev.chiksmedina.solar.boldduotone.Notifications
import dev.chiksmedina.solar.boldduotone.School
import dev.chiksmedina.solar.boldduotone.Search
import dev.chiksmedina.solar.boldduotone.Security
import dev.chiksmedina.solar.boldduotone.SettingsFineTuning
import dev.chiksmedina.solar.boldduotone.ShoppingEcommerce
import dev.chiksmedina.solar.boldduotone.Sports
import dev.chiksmedina.solar.boldduotone.TextFormatting
import dev.chiksmedina.solar.boldduotone.Time
import dev.chiksmedina.solar.boldduotone.Users
import dev.chiksmedina.solar.boldduotone.VideoAudioSound
import dev.chiksmedina.solar.boldduotone.Weather
import kotlin.collections.List as KtList

object BoldDuotoneSolar

val Solar.BoldDuotone: BoldDuotoneSolar
    get() = BoldDuotoneSolar

private var _AllIcons: KtList<ImageVector>? = null

val BoldDuotoneSolar.AllIcons: KtList<ImageVector>
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
