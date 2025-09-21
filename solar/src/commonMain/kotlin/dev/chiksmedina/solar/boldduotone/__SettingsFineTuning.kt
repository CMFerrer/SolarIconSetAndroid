package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Settings
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.SettingsMinimalistic
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Tuning
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Tuning2
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Tuning3
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Tuning4
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.TuningSquare
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.TuningSquare2
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Widget
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Widget2
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Widget3
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Widget4
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Widget5
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.Widget6
import dev.chiksmedina.solar.boldduotone.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val BoldDuotoneSolar.SettingsFineTuning: SettingsFineTuningGroup
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
