package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.settingsfinetuning.Settings
import com.chiksmedina.solar.outline.settingsfinetuning.SettingsMinimalistic
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning2
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning3
import com.chiksmedina.solar.outline.settingsfinetuning.Tuning4
import com.chiksmedina.solar.outline.settingsfinetuning.TuningSquare
import com.chiksmedina.solar.outline.settingsfinetuning.TuningSquare2
import com.chiksmedina.solar.outline.settingsfinetuning.Widget
import com.chiksmedina.solar.outline.settingsfinetuning.Widget2
import com.chiksmedina.solar.outline.settingsfinetuning.Widget3
import com.chiksmedina.solar.outline.settingsfinetuning.Widget4
import com.chiksmedina.solar.outline.settingsfinetuning.Widget5
import com.chiksmedina.solar.outline.settingsfinetuning.Widget6
import com.chiksmedina.solar.outline.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val OutlineSolar.SettingsFineTuning: SettingsFineTuningGroup
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
