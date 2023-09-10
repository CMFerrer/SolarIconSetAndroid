package com.chiksmedina.solar.outline.arrowsaction

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
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.ReciveTwiceSquare: ImageVector
    get() {
        if (_reciveTwiceSquare != null) {
            return _reciveTwiceSquare!!
        }
        _reciveTwiceSquare = Builder(
            name = "ReciveTwiceSquare", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.25f, 8.5f)
                curveTo(6.25f, 8.0858f, 6.5858f, 7.75f, 7.0f, 7.75f)
                horizontalLineTo(11.9285f)
                lineTo(10.5199f, 6.5762f)
                curveTo(10.2017f, 6.311f, 10.1587f, 5.8381f, 10.4238f, 5.5199f)
                curveTo(10.689f, 5.2017f, 11.1619f, 5.1587f, 11.4801f, 5.4238f)
                lineTo(14.4801f, 7.9238f)
                curveTo(14.6511f, 8.0663f, 14.75f, 8.2774f, 14.75f, 8.5f)
                curveTo(14.75f, 8.7226f, 14.6511f, 8.9337f, 14.4801f, 9.0762f)
                lineTo(11.4801f, 11.5762f)
                curveTo(11.1619f, 11.8413f, 10.689f, 11.7983f, 10.4238f, 11.4801f)
                curveTo(10.1587f, 11.1619f, 10.2017f, 10.689f, 10.5199f, 10.4238f)
                lineTo(11.9285f, 9.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 9.25f, 6.25f, 8.9142f, 6.25f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.25f, 15.5f)
                curveTo(6.25f, 15.0858f, 6.5858f, 14.75f, 7.0f, 14.75f)
                horizontalLineTo(11.9285f)
                lineTo(10.5199f, 13.5762f)
                curveTo(10.2017f, 13.311f, 10.1587f, 12.8381f, 10.4238f, 12.5199f)
                curveTo(10.689f, 12.2017f, 11.1619f, 12.1587f, 11.4801f, 12.4238f)
                lineTo(14.4801f, 14.9238f)
                curveTo(14.6511f, 15.0663f, 14.75f, 15.2774f, 14.75f, 15.5f)
                curveTo(14.75f, 15.7226f, 14.6511f, 15.9337f, 14.4801f, 16.0762f)
                lineTo(11.4801f, 18.5762f)
                curveTo(11.1619f, 18.8413f, 10.689f, 18.7983f, 10.4238f, 18.4801f)
                curveTo(10.1587f, 18.1619f, 10.2017f, 17.689f, 10.5199f, 17.4238f)
                lineTo(11.9285f, 16.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.25f, 6.25f, 15.9142f, 6.25f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.25f, 18.0f)
                curveTo(16.25f, 18.4142f, 16.5858f, 18.75f, 17.0f, 18.75f)
                curveTo(17.4142f, 18.75f, 17.75f, 18.4142f, 17.75f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(17.75f, 5.5858f, 17.4142f, 5.25f, 17.0f, 5.25f)
                curveTo(16.5858f, 5.25f, 16.25f, 5.5858f, 16.25f, 6.0f)
                verticalLineTo(18.0f)
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
        return _reciveTwiceSquare!!
    }

private var _reciveTwiceSquare: ImageVector? = null
