package com.chiksmedina.solar.outline.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SettingsFineTuningGroup

val SettingsFineTuningGroup.Tuning: ImageVector
    get() {
        if (_tuning != null) {
            return _tuning!!
        }
        _tuning = Builder(
            name = "Tuning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.9585f, 9.75f)
                curveTo(16.5443f, 9.75f, 16.2085f, 9.4142f, 16.2085f, 9.0f)
                lineTo(16.2085f, 2.0f)
                curveTo(16.2085f, 1.5858f, 16.5443f, 1.25f, 16.9585f, 1.25f)
                curveTo(17.3727f, 1.25f, 17.7085f, 1.5858f, 17.7085f, 2.0f)
                lineTo(17.7085f, 9.0f)
                curveTo(17.7085f, 9.4142f, 17.3727f, 9.75f, 16.9585f, 9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0f, 5.75f)
                curveTo(9.0711f, 5.75f, 10.75f, 7.4289f, 10.75f, 9.5f)
                curveTo(10.75f, 11.5711f, 9.0711f, 13.25f, 7.0f, 13.25f)
                curveTo(4.9289f, 13.25f, 3.25f, 11.5711f, 3.25f, 9.5f)
                curveTo(3.25f, 7.4289f, 4.9289f, 5.75f, 7.0f, 5.75f)
                close()
                moveTo(9.25f, 9.5f)
                curveTo(9.25f, 8.2574f, 8.2426f, 7.25f, 7.0f, 7.25f)
                curveTo(5.7574f, 7.25f, 4.75f, 8.2574f, 4.75f, 9.5f)
                curveTo(4.75f, 10.7426f, 5.7574f, 11.75f, 7.0f, 11.75f)
                curveTo(8.2426f, 11.75f, 9.25f, 10.7426f, 9.25f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 18.25f)
                curveTo(19.0711f, 18.25f, 20.75f, 16.5711f, 20.75f, 14.5f)
                curveTo(20.75f, 12.4289f, 19.0711f, 10.75f, 17.0f, 10.75f)
                curveTo(14.9289f, 10.75f, 13.25f, 12.4289f, 13.25f, 14.5f)
                curveTo(13.25f, 16.5711f, 14.9289f, 18.25f, 17.0f, 18.25f)
                close()
                moveTo(19.25f, 14.5f)
                curveTo(19.25f, 15.7426f, 18.2426f, 16.75f, 17.0f, 16.75f)
                curveTo(15.7574f, 16.75f, 14.75f, 15.7426f, 14.75f, 14.5f)
                curveTo(14.75f, 13.2574f, 15.7574f, 12.25f, 17.0f, 12.25f)
                curveTo(18.2426f, 12.25f, 19.25f, 13.2574f, 19.25f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.2085f, 15.0f)
                curveTo(6.2085f, 14.5858f, 6.5443f, 14.25f, 6.9585f, 14.25f)
                curveTo(7.3727f, 14.25f, 7.7085f, 14.5858f, 7.7085f, 15.0f)
                verticalLineTo(22.0f)
                curveTo(7.7085f, 22.4142f, 7.3727f, 22.75f, 6.9585f, 22.75f)
                curveTo(6.5443f, 22.75f, 6.2085f, 22.4142f, 6.2085f, 22.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.9585f, 22.75f)
                curveTo(16.5443f, 22.75f, 16.2085f, 22.4142f, 16.2085f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(16.2085f, 19.5858f, 16.5443f, 19.25f, 16.9585f, 19.25f)
                curveTo(17.3727f, 19.25f, 17.7085f, 19.5858f, 17.7085f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(17.7085f, 22.4142f, 17.3727f, 22.75f, 16.9585f, 22.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.2085f, 2.0f)
                curveTo(6.2085f, 1.5858f, 6.5443f, 1.25f, 6.9585f, 1.25f)
                curveTo(7.3727f, 1.25f, 7.7085f, 1.5858f, 7.7085f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(7.7085f, 4.4142f, 7.3727f, 4.75f, 6.9585f, 4.75f)
                curveTo(6.5443f, 4.75f, 6.2085f, 4.4142f, 6.2085f, 4.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
            .build()
        return _tuning!!
    }

private var _tuning: ImageVector? = null
