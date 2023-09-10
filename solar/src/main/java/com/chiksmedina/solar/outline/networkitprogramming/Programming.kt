package com.chiksmedina.solar.outline.networkitprogramming

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
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Programming: ImageVector
    get() {
        if (_programming != null) {
            return _programming!!
        }
        _programming = Builder(
            name = "Programming", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.75f, 15.0f)
                curveTo(17.75f, 15.4142f, 17.4142f, 15.75f, 17.0f, 15.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                curveTo(11.25f, 14.5858f, 11.5858f, 14.25f, 12.0f, 14.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 14.25f, 17.75f, 14.5858f, 17.75f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4801f, 9.4238f)
                curveTo(7.1619f, 9.1587f, 6.689f, 9.2016f, 6.4238f, 9.5199f)
                curveTo(6.1587f, 9.8381f, 6.2017f, 10.311f, 6.5199f, 10.5762f)
                lineTo(6.7543f, 10.7715f)
                curveTo(7.4128f, 11.3203f, 7.8435f, 11.6815f, 8.1197f, 11.9874f)
                curveTo(8.3819f, 12.2778f, 8.4069f, 12.414f, 8.4069f, 12.5f)
                curveTo(8.4069f, 12.586f, 8.3819f, 12.7222f, 8.1197f, 13.0126f)
                curveTo(7.8435f, 13.3185f, 7.4128f, 13.6797f, 6.7543f, 14.2285f)
                lineTo(6.5199f, 14.4238f)
                curveTo(6.2017f, 14.689f, 6.1587f, 15.1619f, 6.4238f, 15.4801f)
                curveTo(6.689f, 15.7983f, 7.1619f, 15.8413f, 7.4801f, 15.5762f)
                lineTo(7.7566f, 15.3458f)
                curveTo(8.3615f, 14.8417f, 8.8765f, 14.4126f, 9.2329f, 14.0179f)
                curveTo(9.6115f, 13.5987f, 9.9069f, 13.1166f, 9.9069f, 12.5f)
                curveTo(9.9069f, 11.8834f, 9.6115f, 11.4013f, 9.2329f, 10.9821f)
                curveTo(8.8765f, 10.5874f, 8.3615f, 10.1583f, 7.7566f, 9.6542f)
                lineTo(7.4801f, 9.4238f)
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
        return _programming!!
    }

private var _programming: ImageVector? = null
