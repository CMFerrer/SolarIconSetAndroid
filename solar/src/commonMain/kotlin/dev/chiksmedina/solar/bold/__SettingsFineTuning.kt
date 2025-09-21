package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.settingsfinetuning.Settings
import dev.chiksmedina.solar.bold.settingsfinetuning.SettingsMinimalistic
import dev.chiksmedina.solar.bold.settingsfinetuning.Tuning
import dev.chiksmedina.solar.bold.settingsfinetuning.Tuning2
import dev.chiksmedina.solar.bold.settingsfinetuning.Tuning3
import dev.chiksmedina.solar.bold.settingsfinetuning.Tuning4
import dev.chiksmedina.solar.bold.settingsfinetuning.TuningSquare
import dev.chiksmedina.solar.bold.settingsfinetuning.TuningSquare2
import dev.chiksmedina.solar.bold.settingsfinetuning.Widget
import dev.chiksmedina.solar.bold.settingsfinetuning.Widget2
import dev.chiksmedina.solar.bold.settingsfinetuning.Widget3
import dev.chiksmedina.solar.bold.settingsfinetuning.Widget4
import dev.chiksmedina.solar.bold.settingsfinetuning.Widget5
import dev.chiksmedina.solar.bold.settingsfinetuning.Widget6
import dev.chiksmedina.solar.bold.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val BoldSolar.SettingsFineTuning: SettingsFineTuningGroup
    get() = SettingsFineTuningGroup

private var _AllIcons: KtList<ImageVector>? = null

val SettingsFineTuningGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Settings,
            SettingsMinimalistic,
            Tuning,
            Tuning2,
            Tuning3,
            Tuning4,
            TuningSquare,
            TuningSquare2,
            Widget,
            Widget2,
            Widget3,
            Widget4,
            Widget5,
            Widget6,
            WidgetAdd
        )
        return _AllIcons!!
    }
