package com.chiksmedina.solar.outline.businessstatistic

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
import com.chiksmedina.solar.outline.BusinessStatisticGroup

val BusinessStatisticGroup.GraphNewUp: ImageVector
    get() {
        if (_graphNewUp != null) {
            return _graphNewUp!!
        }
        _graphNewUp = Builder(
            name = "GraphNewUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                curveTo(14.25f, 2.4142f, 13.9142f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(12.0f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
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
                verticalLineTo(10.5f)
                curveTo(21.25f, 10.0858f, 21.5858f, 9.75f, 22.0f, 9.75f)
                curveTo(22.4142f, 9.75f, 22.75f, 10.0858f, 22.75f, 10.5f)
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.25f, 5.0f)
                curveTo(15.25f, 2.9289f, 16.9289f, 1.25f, 19.0f, 1.25f)
                curveTo(21.0711f, 1.25f, 22.75f, 2.9289f, 22.75f, 5.0f)
                curveTo(22.75f, 7.0711f, 21.0711f, 8.75f, 19.0f, 8.75f)
                curveTo(16.9289f, 8.75f, 15.25f, 7.0711f, 15.25f, 5.0f)
                close()
                moveTo(19.0f, 2.75f)
                curveTo(17.7574f, 2.75f, 16.75f, 3.7574f, 16.75f, 5.0f)
                curveTo(16.75f, 6.2426f, 17.7574f, 7.25f, 19.0f, 7.25f)
                curveTo(20.2426f, 7.25f, 21.25f, 6.2426f, 21.25f, 5.0f)
                curveTo(21.25f, 3.7574f, 20.2426f, 2.75f, 19.0f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.75f, 10.0f)
                curveTo(13.75f, 10.4142f, 14.0858f, 10.75f, 14.5f, 10.75f)
                horizontalLineTo(15.1893f)
                lineTo(13.1768f, 12.7626f)
                curveTo(13.0791f, 12.8602f, 12.9209f, 12.8602f, 12.8232f, 12.7626f)
                lineTo(11.2374f, 11.1768f)
                curveTo(10.554f, 10.4934f, 9.446f, 10.4934f, 8.7626f, 11.1768f)
                lineTo(6.4697f, 13.4697f)
                curveTo(6.1768f, 13.7626f, 6.1768f, 14.2374f, 6.4697f, 14.5303f)
                curveTo(6.7626f, 14.8232f, 7.2374f, 14.8232f, 7.5303f, 14.5303f)
                lineTo(9.8232f, 12.2374f)
                curveTo(9.9208f, 12.1398f, 10.0791f, 12.1398f, 10.1768f, 12.2374f)
                lineTo(11.7626f, 13.8232f)
                curveTo(12.446f, 14.5066f, 13.554f, 14.5066f, 14.2374f, 13.8232f)
                lineTo(16.25f, 11.8107f)
                verticalLineTo(12.5f)
                curveTo(16.25f, 12.9142f, 16.5858f, 13.25f, 17.0f, 13.25f)
                curveTo(17.4142f, 13.25f, 17.75f, 12.9142f, 17.75f, 12.5f)
                verticalLineTo(10.0f)
                curveTo(17.75f, 9.5858f, 17.4142f, 9.25f, 17.0f, 9.25f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 9.25f, 13.75f, 9.5858f, 13.75f, 10.0f)
                close()
            }
        }
            .build()
        return _graphNewUp!!
    }

private var _graphNewUp: ImageVector? = null
