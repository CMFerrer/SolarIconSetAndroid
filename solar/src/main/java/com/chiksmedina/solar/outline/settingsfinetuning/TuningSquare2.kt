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

val SettingsFineTuningGroup.TuningSquare2: ImageVector
    get() {
        if (_tuningSquare2 != null) {
            return _tuningSquare2!!
        }
        _tuningSquare2 = Builder(
            name = "TuningSquare2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.25f, 16.0f)
                curveTo(7.25f, 14.4812f, 8.4812f, 13.25f, 10.0f, 13.25f)
                curveTo(11.5188f, 13.25f, 12.75f, 14.4812f, 12.75f, 16.0f)
                curveTo(12.75f, 17.5188f, 11.5188f, 18.75f, 10.0f, 18.75f)
                curveTo(8.4812f, 18.75f, 7.25f, 17.5188f, 7.25f, 16.0f)
                close()
                moveTo(10.0f, 14.75f)
                curveTo(9.3096f, 14.75f, 8.75f, 15.3096f, 8.75f, 16.0f)
                curveTo(8.75f, 16.6904f, 9.3096f, 17.25f, 10.0f, 17.25f)
                curveTo(10.6904f, 17.25f, 11.25f, 16.6904f, 11.25f, 16.0f)
                curveTo(11.25f, 15.3096f, 10.6904f, 14.75f, 10.0f, 14.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.75f, 8.0f)
                curveTo(16.75f, 9.5188f, 15.5188f, 10.75f, 14.0f, 10.75f)
                curveTo(12.4812f, 10.75f, 11.25f, 9.5188f, 11.25f, 8.0f)
                curveTo(11.25f, 6.4812f, 12.4812f, 5.25f, 14.0f, 5.25f)
                curveTo(15.5188f, 5.25f, 16.75f, 6.4812f, 16.75f, 8.0f)
                close()
                moveTo(14.0f, 9.25f)
                curveTo(14.6904f, 9.25f, 15.25f, 8.6904f, 15.25f, 8.0f)
                curveTo(15.25f, 7.3096f, 14.6904f, 6.75f, 14.0f, 6.75f)
                curveTo(13.3096f, 6.75f, 12.75f, 7.3096f, 12.75f, 8.0f)
                curveTo(12.75f, 8.6904f, 13.3096f, 9.25f, 14.0f, 9.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.25f, 16.0f)
                curveTo(13.25f, 15.5858f, 13.5858f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 15.25f, 19.75f, 15.5858f, 19.75f, 16.0f)
                curveTo(19.75f, 16.4142f, 19.4142f, 16.75f, 19.0f, 16.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 16.75f, 13.25f, 16.4142f, 13.25f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 7.25f)
                curveTo(10.4142f, 7.25f, 10.75f, 7.5858f, 10.75f, 8.0f)
                curveTo(10.75f, 8.4142f, 10.4142f, 8.75f, 10.0f, 8.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 8.75f, 4.25f, 8.4142f, 4.25f, 8.0f)
                curveTo(4.25f, 7.5858f, 4.5858f, 7.25f, 5.0f, 7.25f)
                horizontalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.25f, 16.0f)
                curveTo(4.25f, 15.5858f, 4.5858f, 15.25f, 5.0f, 15.25f)
                horizontalLineTo(6.0f)
                curveTo(6.4142f, 15.25f, 6.75f, 15.5858f, 6.75f, 16.0f)
                curveTo(6.75f, 16.4142f, 6.4142f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 16.75f, 4.25f, 16.4142f, 4.25f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 7.25f)
                curveTo(19.4142f, 7.25f, 19.75f, 7.5858f, 19.75f, 8.0f)
                curveTo(19.75f, 8.4142f, 19.4142f, 8.75f, 19.0f, 8.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 8.75f, 17.25f, 8.4142f, 17.25f, 8.0f)
                curveTo(17.25f, 7.5858f, 17.5858f, 7.25f, 18.0f, 7.25f)
                horizontalLineTo(19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
            }
        }
            .build()
        return _tuningSquare2!!
    }

private var _tuningSquare2: ImageVector? = null
