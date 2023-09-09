package com.chiksmedina.solar.bold.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SettingsFineTuningGroup

public val SettingsFineTuningGroup.SettingsMinimalistic: ImageVector
    get() {
        if (_settingsMinimalistic != null) {
            return _settingsMinimalistic!!
        }
        _settingsMinimalistic = Builder(name = "SettingsMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.4277f, 2.0f)
                curveTo(11.3139f, 2.0f, 10.2995f, 2.6007f, 8.2708f, 3.8021f)
                lineTo(7.5847f, 4.2085f)
                curveTo(5.5559f, 5.4099f, 4.5416f, 6.0106f, 3.9847f, 7.0f)
                curveTo(3.4277f, 7.9894f, 3.4277f, 9.1908f, 3.4277f, 11.5937f)
                verticalLineTo(12.4063f)
                curveTo(3.4277f, 14.8092f, 3.4277f, 16.0106f, 3.9847f, 17.0f)
                curveTo(4.5416f, 17.9894f, 5.5559f, 18.5901f, 7.5847f, 19.7915f)
                lineTo(8.2708f, 20.1979f)
                curveTo(10.2995f, 21.3993f, 11.3139f, 22.0f, 12.4277f, 22.0f)
                curveTo(13.5416f, 22.0f, 14.5559f, 21.3993f, 16.5847f, 20.1979f)
                lineTo(17.2708f, 19.7915f)
                curveTo(19.2995f, 18.5901f, 20.3139f, 17.9894f, 20.8708f, 17.0f)
                curveTo(21.4277f, 16.0106f, 21.4277f, 14.8092f, 21.4277f, 12.4063f)
                verticalLineTo(11.5937f)
                curveTo(21.4277f, 9.1908f, 21.4277f, 7.9894f, 20.8708f, 7.0f)
                curveTo(20.3139f, 6.0106f, 19.2995f, 5.4099f, 17.2708f, 4.2085f)
                lineTo(16.5847f, 3.8021f)
                curveTo(14.5559f, 2.6007f, 13.5416f, 2.0f, 12.4277f, 2.0f)
                close()
                moveTo(8.6777f, 12.0f)
                curveTo(8.6777f, 9.9289f, 10.3567f, 8.25f, 12.4277f, 8.25f)
                curveTo(14.4988f, 8.25f, 16.1777f, 9.9289f, 16.1777f, 12.0f)
                curveTo(16.1777f, 14.0711f, 14.4988f, 15.75f, 12.4277f, 15.75f)
                curveTo(10.3567f, 15.75f, 8.6777f, 14.0711f, 8.6777f, 12.0f)
                close()
            }
        }
        .build()
        return _settingsMinimalistic!!
    }

private var _settingsMinimalistic: ImageVector? = null
