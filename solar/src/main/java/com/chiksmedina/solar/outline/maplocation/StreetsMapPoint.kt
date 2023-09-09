package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.StreetsMapPoint: ImageVector
    get() {
        if (_streetsMapPoint != null) {
            return _streetsMapPoint!!
        }
        _streetsMapPoint = Builder(name = "StreetsMapPoint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.4624f, 20.4728f, 5.0655f, 20.7769f, 5.9738f, 20.9659f)
                lineTo(20.9659f, 5.9738f)
                curveTo(20.7769f, 5.0655f, 20.4728f, 4.4624f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                close()
                moveTo(21.1873f, 7.8736f)
                lineTo(15.0611f, 13.9998f)
                lineTo(20.4683f, 19.4071f)
                curveTo(20.763f, 18.9078f, 20.9551f, 18.2678f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 10.3215f, 21.2492f, 8.9767f, 21.1873f, 7.8736f)
                close()
                moveTo(19.4078f, 20.4679f)
                lineTo(14.0004f, 15.0605f)
                lineTo(7.8736f, 21.1873f)
                curveTo(8.9767f, 21.2492f, 10.3215f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.2682f, 20.9551f, 18.9085f, 20.7628f, 19.4078f, 20.4679f)
                close()
                moveTo(17.5863f, 1.4397f)
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
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                close()
                moveTo(4.75f, 8.7572f)
                curveTo(4.75f, 6.4942f, 6.7045f, 4.7499f, 9.0f, 4.7499f)
                curveTo(11.2955f, 4.7499f, 13.25f, 6.4942f, 13.25f, 8.7572f)
                curveTo(13.25f, 10.7835f, 12.0042f, 13.175f, 9.9348f, 14.0593f)
                curveTo(9.3402f, 14.3134f, 8.6598f, 14.3134f, 8.0652f, 14.0593f)
                curveTo(5.9958f, 13.175f, 4.75f, 10.7835f, 4.75f, 8.7572f)
                close()
                moveTo(9.0f, 6.2499f)
                curveTo(7.4296f, 6.2499f, 6.25f, 7.4223f, 6.25f, 8.7572f)
                curveTo(6.25f, 10.3007f, 7.2383f, 12.0747f, 8.6547f, 12.68f)
                curveTo(8.8727f, 12.7732f, 9.1273f, 12.7732f, 9.3453f, 12.68f)
                curveTo(10.7617f, 12.0747f, 11.75f, 10.3007f, 11.75f, 8.7572f)
                curveTo(11.75f, 7.4223f, 10.5705f, 6.2499f, 9.0f, 6.2499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                curveTo(10.0f, 9.5523f, 9.5523f, 10.0f, 9.0f, 10.0f)
                curveTo(8.4477f, 10.0f, 8.0f, 9.5523f, 8.0f, 9.0f)
                curveTo(8.0f, 8.4477f, 8.4477f, 8.0f, 9.0f, 8.0f)
                curveTo(9.5523f, 8.0f, 10.0f, 8.4477f, 10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _streetsMapPoint!!
    }

private var _streetsMapPoint: ImageVector? = null
