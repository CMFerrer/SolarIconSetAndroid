package com.chiksmedina.solar.bold.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SettingsFineTuningGroup

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
                moveTo(16.959f, 9.75f)
                curveTo(16.5448f, 9.75f, 16.209f, 9.4142f, 16.209f, 9.0f)
                lineTo(16.209f, 2.0f)
                curveTo(16.209f, 1.5858f, 16.5448f, 1.25f, 16.959f, 1.25f)
                curveTo(17.3732f, 1.25f, 17.709f, 1.5858f, 17.709f, 2.0f)
                lineTo(17.709f, 9.0f)
                curveTo(17.709f, 9.4142f, 17.3732f, 9.75f, 16.959f, 9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 12.5f)
                curveTo(5.3432f, 12.5f, 4.0f, 11.1569f, 4.0f, 9.5f)
                curveTo(4.0f, 7.8432f, 5.3432f, 6.5f, 7.0f, 6.5f)
                curveTo(8.6568f, 6.5f, 10.0f, 7.8432f, 10.0f, 9.5f)
                curveTo(10.0f, 11.1569f, 8.6568f, 12.5f, 7.0f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 11.5f)
                curveTo(15.3431f, 11.5f, 14.0f, 12.8431f, 14.0f, 14.5f)
                curveTo(14.0f, 16.1569f, 15.3431f, 17.5f, 17.0f, 17.5f)
                curveTo(18.6569f, 17.5f, 20.0f, 16.1569f, 20.0f, 14.5f)
                curveTo(20.0f, 12.8431f, 18.6569f, 11.5f, 17.0f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.209f, 15.0f)
                curveTo(6.209f, 14.5858f, 6.5448f, 14.25f, 6.959f, 14.25f)
                curveTo(7.3732f, 14.25f, 7.709f, 14.5858f, 7.709f, 15.0f)
                verticalLineTo(22.0f)
                curveTo(7.709f, 22.4142f, 7.3732f, 22.75f, 6.959f, 22.75f)
                curveTo(6.5448f, 22.75f, 6.209f, 22.4142f, 6.209f, 22.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.959f, 22.75f)
                curveTo(16.5448f, 22.75f, 16.209f, 22.4142f, 16.209f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(16.209f, 19.5858f, 16.5448f, 19.25f, 16.959f, 19.25f)
                curveTo(17.3732f, 19.25f, 17.709f, 19.5858f, 17.709f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(17.709f, 22.4142f, 17.3732f, 22.75f, 16.959f, 22.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.209f, 2.0f)
                curveTo(6.209f, 1.5858f, 6.5448f, 1.25f, 6.959f, 1.25f)
                curveTo(7.3732f, 1.25f, 7.709f, 1.5858f, 7.709f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(7.709f, 4.4142f, 7.3732f, 4.75f, 6.959f, 4.75f)
                curveTo(6.5448f, 4.75f, 6.209f, 4.4142f, 6.209f, 4.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
            .build()
        return _tuning!!
    }

private var _tuning: ImageVector? = null
